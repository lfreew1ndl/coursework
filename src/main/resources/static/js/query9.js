var App = angular.module('App', []);

App.controller('Query', function ($http, $scope) {
    this.getFromDB = function getFromDB() {

        var firstAge = document.getElementById("firstAge").value;
        var lastAge = document.getElementById("lastAge").value;
        $http.get('/consumers/countConsumersByAgeIsBetween?firstAge='+firstAge+'&lastAge='+lastAge).then(function (response) {
            console.log(response);
            document.getElementById("data").innerText = "Результат пошуку:      " +response.data;
        });
    };
});

