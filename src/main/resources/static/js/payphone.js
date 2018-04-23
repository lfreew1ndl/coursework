var App = angular.module('App', []);

App.controller('Payphone', function ($http, $scope) {
    $http.get('/payphones/get').then(function (response) {
        $scope.payphones = response.data;
    });


    this.startInsertPayphone = function startUpdate() {
        $http.get('/phonenumbers/get').then(function (response) {
            var phonenumbers = response.data;
            var selector = document.getElementById("PayphonePhonenumber");
            $(selector).empty();
            for (var i = 0; i < phonenumbers.length; i++) {
                var option = document.createElement("option");
                option.text = phonenumbers[i].number.number;
                option.value = phonenumbers[i].id;
                selector.add(option);
            }
        });
    };

    this.insertToPayphone = function add() {
        var indexPayphone = document.getElementById("PayphonePhonenumber").selectedIndex;
        var phonenumber_id = document.getElementById("PayphonePhonenumber").options[indexPayphone].value;

        var req = {
            method: 'POST',
            url: '/payphones/insert',
            data: {
                phonenumber_id: phonenumber_id
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        })
    };

    this.startUpdatePayphone = function startUpdate(id, phonenumber) {
        $http.get('/phonenumbers/get').then(function (response) {
            var phonenumbers = response.data;
            var selector = document.getElementById("PayphonePhonenumberUPD");
            $(selector).empty();
            for (var i = 0; i < phonenumbers.length; i++) {
                var option = document.createElement("option");
                if (phonenumbers[i].id == phonenumber){
                    option.selected = 'selected';
                }
                option.text = phonenumbers[i].number.number;
                option.value = phonenumbers[i].id;
                selector.add(option);
            }
        });

        document.getElementById("PayphoneIdUPD").innerText = id;
    };

    this.updatePayphone = function update() {
        var id = document.getElementById("PayphoneIdUPD").innerText;
        var indexPayphone = document.getElementById("PayphonePhonenumberUPD").selectedIndex;
        var phonenumber_id = document.getElementById("PayphonePhonenumberUPD").options[indexPayphone].value;


        var req = {
            method: 'POST',
            url: '/payphones/update?id='+id,
            data: {
                phonenumber_id: phonenumber_id
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        })
    };

    this.delFromPayphone = function del(id) {
        $http.get('/payphones/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

