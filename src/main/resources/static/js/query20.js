var App = angular.module('App', []);

App.controller('Query', function ($http, $scope) {
    
    this.getFromDB = function getFromDB() {
        var indexType = document.getElementById("ATCType").selectedIndex;
        var atcType = document.getElementById("ATCType").options[indexType].innerHTML;
        $http.get('/mtces/getMtcsByAtcType?atcType='+atcType).then(function (response) {
            console.log(response);
            $scope.items = response.data;
        });
    };
});

