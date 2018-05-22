var App = angular.module('App',[]);

App.controller('Region',function ($http,$scope) {

    $http.get('/regions/get').then(function (response){
        $scope.regions=response.data;
        console.log(response);
    });
    this.insertToRegion = function add() {
        var name = document.getElementById("RegionName").value;

        var req = {
            method: 'POST',
            url: '/regions/insert',
            data: {
                name: name
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.startUpdateRegion = function startUpdate(id,name) {
        document.getElementById("RegionIdUPD").innerText = id;
        document.getElementById("RegionNameUPD").value = name;
    };

    this.updateRegion = function update() {
        var id = document.getElementById("RegionIdUPD").innerText;
        var name = document.getElementById("RegionNameUPD").value;
        var req = {
            method: 'POST',
            url: '/regions/update?id=' + id,
            data: {
                name: name
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromRegion = function del(id) {
        $http.get('/regions/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

