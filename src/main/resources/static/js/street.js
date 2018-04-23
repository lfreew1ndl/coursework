var App = angular.module('App', []);

App.controller('Street', function ($http, $scope) {
    $http.get('/streets/get').then(function (response) {
        $scope.streets = response.data;
    });


    this.startInsertStreet = function startUpdate() {
        $http.get('/regions/get').then(function (response) {
            var regions = response.data;
            var selector = document.getElementById("StreetRegion");
            $(selector).empty();
            for (var i = 0; i < regions.length; i++) {
                var option = document.createElement("option");
                option.text = regions[i].name;
                option.value = regions[i].id;
                selector.add(option);
            }
        });
        $http.get('/mtces/get').then(function (response) {
            var mtces = response.data;
            var selector = document.getElementById("StreetMTC");
            $(selector).empty();
            for (var i = 0; i < mtces.length; i++) {
                var option = document.createElement("option");
                option.text = mtces[i].name;
                option.value = mtces[i].id;
                selector.add(option);
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
        $http(req).then(function (resp) {
            window.location.reload();
        })
    };

    this.startUpdateStreet = function startUpdate(id, name,region, index, channels,mtc) {
        $http.get('/regions/get').then(function (response) {
            var regions = response.data;
            var selector = document.getElementById("StreetRegionUPD");
            $(selector).empty();
            for (var i = 0; i < regions.length; i++) {
                var option = document.createElement("option");
                if (regions[i].id == region){
                    option.selected = 'selected';
                }
                option.text = regions[i].name;
                option.value = regions[i].id;
                selector.add(option);
            }
        });
        $http.get('/mtces/get').then(function (response) {
            var mtces = response.data;
            var selector = document.getElementById("StreetMTCUPD");
            $(selector).empty();
            for (var i = 0; i < mtces.length; i++) {
                var option = document.createElement("option");
                if (mtces[i].id == mtc){
                    option.selected = 'selected';
                }
                option.text = mtces[i].name;
                option.value = mtces[i].id;
                selector.add(option);
            }
        });
        document.getElementById("StreetIdUPD").innerText = id;
        document.getElementById("StreetNameUPD").value = name;
        document.getElementById("StreetChannelsUPD").value = channels;
        document.getElementById("StreetIndexUPD").value = index;
    };

    this.updateStreet = function update() {
        var id = document.getElementById("StreetIdUPD").innerText;
        var name = document.getElementById("StreetNameUPD").value;
        var index = document.getElementById("StreetIndexUPD").value;
        var channels = document.getElementById("StreetChannelsUPD").value;

        var indexRegion = document.getElementById("StreetRegionUPD").selectedIndex;
        var region_id = document.getElementById("StreetRegionUPD").options[indexRegion].value;

        var indexMTC = document.getElementById("StreetMTCUPD").selectedIndex;
        var mtc_id = document.getElementById("StreetMTCUPD").options[indexMTC].value;

        var req = {
            method: 'POST',
            url: '/streets/update?id='+id,
            data: {
                name: name,
                region_id: region_id,
                index: index,
                channels: channels,
                mtc_id: mtc_id
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        })
    };

    this.delFromStreet = function del(id) {
        $http.get('/streets/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

