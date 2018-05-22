var App = angular.module('App', []);

App.controller('Query', function ($http, $scope) {
    $http.get('/regions/get').then(function (response) {
        var regions = response.data;
        var selector = document.getElementById("RegionName");
        $(selector).empty();
        for (var i = 0; i < regions.length; i++) {
            var option = document.createElement("option");
            option.text = regions[i].name;
            option.value = regions[i].id;
            selector.add(option);
        }
    });

    this.getFromDB = function getFromDB() {
        var index = document.getElementById("RegionName").selectedIndex;
        var selectedRegion = document.getElementById("RegionName").options[index].value;
        $http.get('/consumers/getConsumersByBalanceLessThan0AAndPhonenumberStreetRegion_id?id=' + selectedRegion).then(function (response) {
            console.log(response);
            $scope.items = response.data;
        });
    };
});

