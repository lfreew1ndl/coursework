var App = angular.module('App', []);

App.controller('Query', function ($http, $scope) {
    this.getFromDB = function getFromDB() {
        var number = document.getElementById("Number").value;
        $http.get('/consumers/getConsumerByPhonenumberNumber?number='+ number).then(function (response) {
            console.log(response);
            $scope.items = response.data;
        });
    };
});

