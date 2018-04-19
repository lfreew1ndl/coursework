var App = angular.module('App',[]);

App.controller('City',function ($http,$scope) {
    $http.get('/cities/get').then(function (response){
        $scope.cities=response.data;
        console.log(response);
    });
    this.insertToCity = function add() {
        var id = document.getElementById("CityId").value;
        var name = document.getElementById("CityName").value;

        var req = {
            method: 'POST',
            url: '/cities/insert',
            data: {
                id: id,
                name: name
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.startUpdateCity = function startUpdate(id,name) {
        document.getElementById("CityIdUPD").value = id;
        document.getElementById("CityNameUPD").value = name;
    };

    this.updateCity = function update() {
        var id = document.getElementById("CityIdUPD").value;
        var name = document.getElementById("CityNameUPD").value;
        var req = {
            method: 'POST',
            url: '/cities/update?id=' + id,
            data: {
                id: id,
                name: name
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromCity = function del(id) {
        $http.get('/cities/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

