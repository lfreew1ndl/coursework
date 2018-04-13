var App = angular.module('App',[]);

App.controller('Ctrl',function ($http,$scope) {
    $http.get('/get/calls').then(function (response){
        $scope.calls=response.data;
        console.log(response);
    });

    $http.get('/get/cities').then(function (response){
        $scope.cities=response.data;
        console.log(response);
    });

    $http.get('/get/consumers').then(function (response){
        $scope.consumers=response.data;
        console.log(response);
    });

    $http.get('/get/mtces').then(function (response){
        $scope.mtces=response.data;
        console.log(response);
    });

    $http.get('/get/numbers').then(function (response){
        $scope.numbers=response.data;
        console.log(response);
    });

    $http.get('/get/payphones').then(function (response){
        $scope.payphones=response.data;
        console.log(response);
    });

    $http.get('/get/phonenumbers').then(function (response){
        $scope.phonenumbers=response.data;
        console.log(response);
    });

    $http.get('/get/queues').then(function (response){
        $scope.queues=response.data;
        console.log(response);
    });

    $http.get('/get/regions').then(function (response){
        $scope.regions=response.data;
        console.log(response);
    });

    $http.get('/get/streets').then(function (response){
        $scope.streets=response.data;
        console.log(response);
    });
});