var App = angular.module('App',[]);

App.controller('Ctrl',function ($http,$scope) {
    // $http.get('/calls/get').then(function (response){
    //     $scope.calls=response.data;
    //     console.log(response);
    // });
    //
    // $http.get('/cities/get').then(function (response){
    //     $scope.cities=response.data;
    //     console.log(response);
    // });
    //
    // $http.get('/consumers/get').then(function (response){
    //     $scope.consumers=response.data;
    //     console.log(response);
    // });

    $http.get('/mtces/get').then(function (response){
        $scope.mtces=response.data;
        console.log(response);
    });
    //
    // $http.get('/numbers/get').then(function (response){
    //     $scope.numbers=response.data;
    //     console.log(response);
    // });
    //
    // $http.get('/payphones/get').then(function (response){
    //     $scope.payphones=response.data;
    //     console.log(response);
    // });
    //
    // $http.get('/phonenumbers/get').then(function (response){
    //     $scope.phonenumbers=response.data;
    //     console.log(response);
    // });
    //
    // $http.get('/queues/get').then(function (response){
    //     $scope.queues=response.data;
    //     console.log(response);
    // });
    //
    // $http.get('/regions/get').then(function (response){
    //     $scope.regions=response.data;
    //     console.log(response);
    // });
    //
    // $http.get('/streets/get').then(function (response){
    //     $scope.streets=response.data;
    //     console.log(response);
    // });

    this.insertToMTC = function add() {
        var name = document.getElementById("nameATC").value;
        var indexType = document.getElementById("ATCType").selectedIndex;

        var atcType = document.getElementById("ATCType").options[indexType].innerHTML;
        var req = {
            method: 'POST',
            url: '/mtces/insert',
            data: {
                name: name,
                atcType: atcType
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromMTC = function del(id) {
        $http.get('/mtces/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});
