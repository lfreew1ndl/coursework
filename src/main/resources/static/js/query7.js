var App = angular.module('App', []);

App.controller('Query', function ($http, $scope) {
    $http.get('/mtces/get').then(function (response) {
        var mtces = response.data;
        var selector = document.getElementById("MTCName");
        $(selector).empty();
        for (var i = 0; i < mtces.length; i++) {
            var option = document.createElement("option");
            option.text = mtces[i].name;
            option.value = mtces[i].id;
            selector.add(option);
        }
    });

    this.getFromDB = function getFromDB() {
        var index = document.getElementById("MTCName").selectedIndex;
        var selectedMTC = document.getElementById("MTCName").options[index].value;
        $http.get('/consumers/countConsumersByPhonenumberStreetMtc_Id?id=' + selectedMTC).then(function (response) {
            console.log(response);
            document.getElementById("data").innerText = "Результат пошуку:      " +response.data;
        });
    };
});

