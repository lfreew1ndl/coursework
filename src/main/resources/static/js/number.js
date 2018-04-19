var App = angular.module('App',[]);

App.controller('Number',function ($http,$scope) {
    $http.get('/numbers/get').then(function (response){
        $scope.numbers=response.data;
        console.log(response);
    });
    this.insertToNumber = function add() {
        var number = document.getElementById("Number").value;

        var req = {
            method: 'POST',
            url: '/numbers/insert',
            data: {
                number: number
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.startUpdateNumber = function startUpdate(id,number) {
        document.getElementById("NumberIdUPD").innerText = id;
        document.getElementById("NumberUPD").value = number;
    };

    this.updateNumber = function update() {
        var id = document.getElementById("NumberIdUPD").innerText;
        var number = document.getElementById("NumberUPD").value;
        var req = {
            method: 'POST',
            url: '/numbers/update?id=' + id,
            data: {
                number: number
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromNumber = function del(id) {
        $http.get('/numbers/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

