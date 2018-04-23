var App = angular.module('App', []);

App.controller('Queue', function ($http, $scope) {
    $http.get('/queues/get').then(function (response) {
        $scope.queues = response.data;
    });


    this.startInsertQueue = function startUpdate() {
        $http.get('/streets/get').then(function (response) {
            var streets = response.data;
            var selector = document.getElementById("QueueStreet");
            $(selector).empty();
            for (var i = 0; i < streets.length; i++) {
                var option = document.createElement("option");
                option.text = streets[i].name +" рег. " + streets[i].region.name;
                option.value = streets[i].id;
                selector.add(option);
            }
        });
    };

    this.insertToQueue = function add() {
        var firstName = document.getElementById("QueueFirstName").value;
        var lastName = document.getElementById("QueueLastName").value;
        var sex = document.getElementById("QueueSex").value;

        var age = document.getElementById("QueueAge").value;
        var houseNumber = document.getElementById("QueueHouseNumber").value;
        var apartment = document.getElementById("QueueApartment").value;
        var beneficiary = document.getElementById("QueueBeneficiary").checked;

        var indexStreet = document.getElementById("QueueStreet").selectedIndex;
        var street_id = document.getElementById("QueueStreet").options[indexStreet].value;

        var req = {
            method: 'POST',
            url: '/queues/insert',
            data: {
                firstName: firstName,
                lastName: lastName,
                sex: sex,
                age: age,
                houseNumber: houseNumber,
                apartment: apartment,
                beneficiary: beneficiary,
                street_id: street_id
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        });
    };

    this.startUpdateQueue = function startUpdate(id,firstName,lastName,sex,age,street,houseNumber,apartment,beneficiary) {
        $http.get('/streets/get').then(function (response) {
            var streets = response.data;
            var selector = document.getElementById("QueueStreetUPD");
            $(selector).empty();
            for (var i = 0; i < streets.length; i++) {
                var option = document.createElement("option");
                if (streets[i].id == street){
                    option.selected = 'selected';
                }
                option.text = streets[i].name+" рег. " + streets[i].region.name;
                option.value = streets[i].id;
                selector.add(option);
            }
        });
        document.getElementById("QueueIdUPD").innerText = id;
        document.getElementById("QueueFirstNameUPD").value = firstName;
        document.getElementById("QueueLastNameUPD").value = lastName;
        var QueueSex = document.getElementById("QueueSexUPD");
        QueueSex.value = sex;
        document.getElementById("QueueAgeUPD").value = age;
        document.getElementById("QueueBeneficiaryUPD").checked = beneficiary;
        document.getElementById("QueueHouseNumberUPD").value = houseNumber;
        document.getElementById("QueueApartmentUPD").value = apartment;
    };

    this.updateQueue = function update() {
        var id = document.getElementById("QueueIdUPD").innerText;
        var firstName = document.getElementById("QueueFirstNameUPD").value;
        var lastName = document.getElementById("QueueLastNameUPD").value;
        var sex = document.getElementById("QueueSexUPD").value;

        var age = document.getElementById("QueueAgeUPD").value;
        var houseNumber = document.getElementById("QueueHouseNumberUPD").value;
        var apartment = document.getElementById("QueueApartmentUPD").value;
        var beneficiary = document.getElementById("QueueBeneficiaryUPD").checked;

        var indexStreet = document.getElementById("QueueStreetUPD").selectedIndex;
        var street_id = document.getElementById("QueueStreetUPD").options[indexStreet].value;

        var req = {
            method: 'POST',
            url: '/queues/update?id='+id,
            data: {
                firstName: firstName,
                lastName: lastName,
                sex: sex,
                age: age,
                houseNumber: houseNumber,
                apartment: apartment,
                beneficiary: beneficiary,
                street_id: street_id
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        });
    };

    this.delFromQueue = function del(id) {
        $http.get('/queues/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

