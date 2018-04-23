var App = angular.module('App', []);

App.controller('Consumer', function ($http, $scope) {
    $http.get('/consumers/get').then(function (response) {
        $scope.consumers = response.data;
    });


    this.startInsertConsumer = function startUpdate() {
        $http.get('/phonenumbers/get').then(function (response) {
            var phonenumbers = response.data;
            var selector = document.getElementById("ConsumerPhonenumber");
            $(selector).empty();
            for (var i = 0; i < phonenumbers.length; i++) {
                var option = document.createElement("option");
                option.text = phonenumbers[i].number.number;
                option.value = phonenumbers[i].id;
                selector.add(option);
            }
        });
    };

    this.insertToConsumer = function add() {
        var firstName = document.getElementById("ConsumerFirstName").value;
        var lastName = document.getElementById("ConsumerLastName").value;
        var sex = document.getElementById("ConsumerSex").value;

        var age = document.getElementById("ConsumerAge").value;
        var balance = document.getElementById("ConsumerBalance").value;
        var beneficiary = document.getElementById("ConsumerBeneficiary").checked;
        var connected = document.getElementById("ConsumerConnected").checked;

        var indexPhonenumber = document.getElementById("ConsumerPhonenumber").selectedIndex;
        var phonenumber_id = document.getElementById("ConsumerPhonenumber").options[indexPhonenumber].value;

        var req = {
            method: 'POST',
            url: '/consumers/insert',
            data: {
                firstName: firstName,
                lastName: lastName,
                sex: sex,
                age: age,
                balance: balance,
                beneficiary: beneficiary,
                connected: connected,
                phonenumber_id: phonenumber_id
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        });
    };

    this.startUpdateConsumer = function startUpdate(id,firstName,lastName,sex,age,balance,beneficiary,phonenumber,connected) {
        $http.get('/phonenumbers/get').then(function (response) {
            var phonenumbers = response.data;
            var selector = document.getElementById("ConsumerPhonenumberUPD");
            $(selector).empty();
            for (var i = 0; i < phonenumbers.length; i++) {
                var option = document.createElement("option");
                if (phonenumbers[i].id == phonenumber){
                    option.selected = 'selected';
                }
                option.text = phonenumbers[i].number.number;
                option.value = phonenumbers[i].id;
                selector.add(option);
            }
        });
        document.getElementById("ConsumerIdUPD").innerText = id;
        document.getElementById("ConsumerFirstNameUPD").value = firstName;
        document.getElementById("ConsumerLastNameUPD").value = lastName;
        var ConsumerSex = document.getElementById("ConsumerSexUPD");
        ConsumerSex.value = sex
        console.log(sex);
        console.log(ConsumerSex)
        document.getElementById("ConsumerAgeUPD").value = age;
        document.getElementById("ConsumerBalanceUPD").value = balance;
        document.getElementById("ConsumerBeneficiaryUPD").checked = beneficiary;
        document.getElementById("ConsumerConnectedUPD").checked = connected;
    };

    this.updateConsumer = function update() {
        var id = document.getElementById("ConsumerIdUPD").innerText;
        var firstName = document.getElementById("ConsumerFirstNameUPD").value;
        var lastName = document.getElementById("ConsumerLastNameUPD").value;

        var age = document.getElementById("ConsumerAgeUPD").value;
        var balance = document.getElementById("ConsumerBalanceUPD").value;
        var beneficiary = document.getElementById("ConsumerBeneficiaryUPD").checked;
        var connected = document.getElementById("ConsumerConnectedUPD").checked;

        var indexPhonenumber = document.getElementById("ConsumerPhonenumberUPD").selectedIndex;
        var phonenumber_id = document.getElementById("ConsumerPhonenumberUPD").options[indexPhonenumber].value;

        var indexSex = document.getElementById("ConsumerSexUPD").selectedIndex;

        var sex = document.getElementById("ConsumerSexUPD").options[indexSex].innerHTML

        var req = {
            method: 'POST',
            url: '/consumers/update?id='+id,
            data: {
                firstName: firstName,
                lastName: lastName,
                sex: sex,
                age: age,
                balance: balance,
                beneficiary: beneficiary,
                connected: connected,
                phonenumber_id: phonenumber_id
            }
        };
        $http(req).then(function (resp) {
            window.location.reload();
        });
    };

    this.delFromConsumer = function del(id) {
        $http.get('/consumers/del?id=' + id).then(function () {
            window.location.reload();
        });
    };
});

