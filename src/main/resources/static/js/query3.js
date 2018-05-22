var App = angular.module('App', []);

App.controller('Query', function ($http, $scope) {
    this.getFromDB = function getFromDB() {
        $http.get('/consumers/getConsumersByBalanceLessThan0').then(function (response) {
            console.log(response);
            $scope.items = response.data;
        });
    };
});

