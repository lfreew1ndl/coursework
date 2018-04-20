var App = angular.module('App', []);

App.controller('Street', function ($http, $scope) {
    $http.get('/streets/get').then(function (response) {
        $scope.streets = response.data;
        console.log(response);
    });


    this.startInsertStreet = function startUpdate() {
        $http.get('/regions/get').then(function (response) {
            console.log(response);
            var regions = response.data;
            var selector = document.getElementById("StreetRegion");
            for (var i = 0; i < regions.length; i++) {
                var option = document.createElement("option");
                option.text = regions[i].name;
                option.value = regions[i].id;
                selector.add(option);
                console.log(selector);
            }
        });
        $http.get('/mtces/get').then(function (response) {
            console.log(response);
            var regions = response.data;
            var selector = document.getElementById("StreetMTC");
            for (var i = 0; i < regions.length; i++) {
                var option = document.createElement("option");
                option.text = regions[i].name;
                option.value = regions[i].id;
                selector.add(option);
                console.log(selector);
            }
        });
    };

    this.insertToStreet = function add() {
        var name = document.getElementById("StreetName").value;
        var index = document.getElementById("StreetIndex").value;
        var channels = document.getElementById("StreetChannels").value;

        var indexRegion = document.getElementById("StreetRegion").selectedIndex;
        var region_id = document.getElementById("StreetRegion").options[indexRegion].value;

        var indexMTC = document.getElementById("StreetMTC").selectedIndex;
        var mtc_id = document.getElementById("StreetMTC").options[indexMTC].value;

        var req = {
            method: 'POST',
            url: '/streets/insert',
            data: {
                name: name,
                region_id: region_id,
                index: index,
                channels: channels,
                mtc_id: mtc_id
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.startUpdateStreet = function startUpdate(id, name, index, channels) {
        document.getElementById("StreetIdUPD").innerText = id;
        document.getElementById("StreetNameUPD").value = name;
        document.getElementById("StreetIndexUPD").value = index;
        document.getElementById("StreetChannelsUPD").value = channels;
    };

    this.updateStreet = function update() {
        var id = document.getElementById("StreetIdUPD").innerText;
        var name = document.getElementById("StreetNameUPD").value;
        var index = document.getElementById("StreetIndexUPD").value;
        var channels = document.getElementById("StreetChannelsUPD").value;
        var req = {
            method: 'POST',
            url: '/streets/update?id=' + id,
            data: {
                name: name,
                index: index,
                channels: channels
            }
        };
        console.log(req);
        $http(req).then(function (resp) {
            console.log(resp);
            window.location.reload();
        })
    };

    this.delFromStreet = function del(id) {
        $http.get('/streets/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

