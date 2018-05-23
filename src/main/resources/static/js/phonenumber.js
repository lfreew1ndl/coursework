var App = angular.module('App', []);

App.controller('Phonenumber', function ($http, $scope) {
    var time = performance.now();
    $http.get('/phonenumbers/get').then(function (response) {
        time = performance.now() - time;

        console.log(response);
        $scope.phonenumbers = response.data;
    });


    this.startInsertPhonenumber = function startUpdate() {
        $http.get('/streets/get').then(function (response) {
            var streets = response.data;
            var selector = document.getElementById("PhonenumberStreet");
            $(selector).empty();
            for (var i = 0; i < streets.length; i++) {
                var option = document.createElement("option");
                option.text = streets[i].name +" рег.  "+ streets[i].region.name;
                option.value = streets[i].id;
                selector.add(option);
            }
        });
        $http.get('/numbers/getNumbersByPhonenumberIsNull').then(function (response) {
            var numbers = response.data;
            var selector = document.getElementById("PhonenumberNumber");
            $(selector).empty();
            for (var i = 0; i < numbers.length; i++) {
                var option = document.createElement("option");
                option.text = numbers[i].number;
                option.value = numbers[i].id;
                selector.add(option);
            }
        });
    };

    this.insertToPhonenumber = function add() {
        ;

        var houseNumber = document.getElementById("PhonenumberHouseNumber").value;
        var apartment = document.getElementById("PhonenumberApartment").value;

        var indexNumber = document.getElementById("PhonenumberNumber").selectedIndex;
        var number_id = document.getElementById("PhonenumberNumber").options[indexNumber].value;

        var indexPhoneType = document.getElementById("PhonenumberPhoneType").selectedIndex;
        var phoneType = document.getElementById("PhonenumberPhoneType").options[indexPhoneType].value;

        var indexStreet = document.getElementById("PhonenumberStreet").selectedIndex;
        var street_id = document.getElementById("PhonenumberStreet").options[indexStreet].value;

        var interspace = document.getElementById("PhonenumberInterspace").checked;

        var req = {
            method: 'POST',
            url: '/phonenumbers/insert',
            data: {
                number_id: number_id,
                houseNumber: houseNumber,
                apartment: apartment,
                interspace: interspace,
                street_id: street_id,
                phoneType: phoneType
            }
        };
        var time = performance.now()
        $http(req).then(function (resp) {
            time = performance.now() - time;
            window.location.reload();
        })
    };

    this.startUpdatePhonenumber = function startUpdate(id,number,houseNumber,apartment,interspace,phoneType,street) {
        $http.get('/streets/get').then(function (response) {
            var streets = response.data;
            var selector = document.getElementById("PhonenumberStreetUPD");
            $(selector).empty();
            for (var i = 0; i < streets.length; i++) {
                var option = document.createElement("option");
                if (streets[i].id == street){
                    option.selected = 'selected';
                }
                option.text = streets[i].name + " рег. "+ streets[i].region.name;
                option.value = streets[i].id;
                selector.add(option);
            }
        });
        $http.get('/numbers/get').then(function (response) {
            var numbers = response.data;
            var selector = document.getElementById("PhonenumberNumberUPD");
            $(selector).empty();
            for (var i = 0; i < numbers.length; i++) {
                var option = document.createElement("option");
                if (numbers[i].id == number){
                    option.selected = 'selected';
                }
                option.text = numbers[i].number;
                option.value = numbers[i].id;
                selector.add(option);
            }
        });
        document.getElementById("PhonenumberIdUPD").innerText = id;
        document.getElementById("PhonenumberHouseNumberUPD").value = houseNumber;
        document.getElementById("PhonenumberApartmentUPD").value = apartment;
        document.getElementById("PhonenumberInterspaceUPD").checked  = interspace;
    };

    this.updatePhonenumber = function update() {
        var id = document.getElementById("PhonenumberIdUPD").innerText;
        var houseNumber = document.getElementById("PhonenumberHouseNumberUPD").value;
        var apartment = document.getElementById("PhonenumberApartmentUPD").value;

        var indexNumber = document.getElementById("PhonenumberNumberUPD").selectedIndex;
        var number_id = document.getElementById("PhonenumberNumberUPD").options[indexNumber].value;

        var indexPhoneType = document.getElementById("PhonenumberPhoneTypeUPD").selectedIndex;
        var phoneType = document.getElementById("PhonenumberPhoneTypeUPD").options[indexPhoneType].value;

        var indexStreet = document.getElementById("PhonenumberStreetUPD").selectedIndex;
        var street_id = document.getElementById("PhonenumberStreetUPD").options[indexStreet].value;

        var interspace = document.getElementById("PhonenumberInterspaceUPD").checked;

        var req = {
            method: 'POST',
            url: '/phonenumbers/update?id='+id,
            data: {
                number_id: number_id,
                houseNumber: houseNumber,
                apartment: apartment,
                interspace: interspace,
                street_id: street_id,
                phoneType: phoneType
            }
        };
        var time = performance.now();
        $http(req).then(function (resp) {
            time = performance.now() - time;

            window.location.reload();
        })
    };

    time = performance.now();
    this.delFromPhonenumber = function del(id) {
        $http.get('/phonenumbers/del?id=' + id).then(function () {
            time = performance.now() - time;
            window.location.reload();
        });
    };
});

