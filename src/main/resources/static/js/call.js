var App = angular.module('App', []);

App.controller('Call', function ($http, $scope) {
    $http.get('/calls/get').then(function (response) {
        $scope.calls = response.data;
    });


    this.startInsertCall = function startUpdate() {
        $http.get('/cities/get').then(function (response) {
            var cities = response.data;
            var selector = document.getElementById("CallCityWhoCall");
            var selector1 = document.getElementById("CallCityToWhomCall");
            $(selector).empty();
            $(selector1).empty();
            for (var i = 0; i < cities.length; i++) {
                var option = document.createElement("option");
                var option1 = document.createElement("option");
                option.text = cities[i].name;
                option.value = cities[i].id;
                option1.text = cities[i].name;
                option1.value = cities[i].id;
                selector.add(option);
                selector1.add(option1);
            }
        });
    };

    this.insertToCall = function add() {
        var whoCallNumber = document.getElementById("CallWhoCallNumber").value;
        var toWhomCallNumber = document.getElementById("CallToWhomCallNumber").value;
        var data = document.getElementById("CallData").value;


        var indexCityCodeWhoCall = document.getElementById("CallCityWhoCall").selectedIndex;
        var cityCodeWhoCall = document.getElementById("CallCityWhoCall").options[indexCityCodeWhoCall].value;

        var indexCityCodeToWhomCall = document.getElementById("CallCityToWhomCall").selectedIndex;
        var cityCodeToWhomCall = document.getElementById("CallCityToWhomCall").options[indexCityCodeToWhomCall].value;

        var req = {
            method: 'POST',
            url: '/calls/insert',
            data: {
                whoCallNumber: whoCallNumber,
                toWhomCallNumber: toWhomCallNumber,
                data: data,
                cityCodeWhoCall: cityCodeWhoCall,
                cityCodeToWhomCall: cityCodeToWhomCall
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        });
    };

    this.startUpdateCall = function startUpdate(id,whoCallNumber,toWhomCallNumber,cityCodeWhoCall,cityCodeToWhomCall,data) {
        $http.get('/cities/get').then(function (response) {
            var cities = response.data;
            var selector = document.getElementById("CallCityWhoCallUPD");
            var selector1 = document.getElementById("CallCityToWhomCallUPD");
            $(selector).empty();
            $(selector1).empty();
            for (var i = 0; i < cities.length; i++) {
                var option = document.createElement("option");
                var option1 = document.createElement("option");
                if (cities[i].id == cityCodeWhoCall){
                    option.selected = 'selected';
                }

                if (cities[i].id == cityCodeToWhomCall){
                    option1.selected = 'selected';
            }
            option.text = cities[i].name;
            option.value = cities[i].id;
            option1.text = cities[i].name;
            option1.value = cities[i].id;
            selector.add(option);
                selector1.add(option1);
            }
        });
        document.getElementById("CallIdUPD").innerText = id;
        document.getElementById("CallWhoCallNumberUPD").value = whoCallNumber;
        document.getElementById("CallToWhomCallNumberUPD").value = toWhomCallNumber;
        document.getElementById("CallDataUPD").value = data;
    };

    this.updateCall = function update() {
        var id = document.getElementById("CallIdUPD").innerText;
        var whoCallNumber = document.getElementById("CallWhoCallNumberUPD").value;
        var toWhomCallNumber = document.getElementById("CallToWhomCallNumberUPD").value;
        var data = document.getElementById("CallDataUPD").value;


        var indexCityCodeWhoCall = document.getElementById("CallCityWhoCallUPD").selectedIndex;
        var cityCodeWhoCall = document.getElementById("CallCityWhoCallUPD").options[indexCityCodeWhoCall].value;

        var indexCityCodeToWhomCall = document.getElementById("CallCityToWhomCallUPD").selectedIndex;
        var cityCodeToWhomCall = document.getElementById("CallCityToWhomCallUPD").options[indexCityCodeToWhomCall].value;

        var req = {
            method: 'POST',
            url: '/calls/update?id='+id,
            data: {
                whoCallNumber: whoCallNumber,
                toWhomCallNumber: toWhomCallNumber,
                data: data,
                cityCodeWhoCall: cityCodeWhoCall,
                cityCodeToWhomCall: cityCodeToWhomCall
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        });
    };

    this.delFromCall = function del(id) {
        $http.get('/calls/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

