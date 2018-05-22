var App = angular.module('App',[]);

App.controller('MTC',function ($http,$scope) {
    $http.get('/mtces/get').then(function (response){
        $scope.mtces=response.data;
        console.log(response);
    });
    this.insertToMTC = function add() {
        var name = document.getElementById("ATCname").value;
        var indexType = document.getElementById("ATCType").selectedIndex;

        var atcType = document.getElementById("ATCType").options[indexType].innerHTML;
        var req = {
            method: 'POST',
            url: '/mtces/insert',
            data: {
                name: name,
                atcType: atcType
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.startUpdateMTC = function startUpdate(id,type,name) {
        document.getElementById("ATCidUPD").innerText = id;
        document.getElementById("ATCnameUPD").value = name;
        var ATCtype = document.getElementById("ATCTypeUPD");
        ATCtype.value = type;
    };

    this.updateMTC = function update() {
        var id = document.getElementById("ATCidUPD").innerText;
        var name = document.getElementById("ATCnameUPD").value;
        var indexType = document.getElementById("ATCTypeUPD").selectedIndex;

        var atcType = document.getElementById("ATCTypeUPD").options[indexType].innerHTML;
        var req = {
            method: 'POST',
            url: '/mtces/update?id=' + id,
            data: {
                name: name,
                atcType: atcType
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromMTC = function del(id) {
        $http.get('/mtces/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

