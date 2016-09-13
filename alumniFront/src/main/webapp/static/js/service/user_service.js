'use strict';

angular.module('myApp').factory('UserService', ['$http', '$q', function($http, $q){

 	var REST_SERVICE_URI = 'http://localhost:8081/alumni/user11/';

    var factory = {
        
       fetchAllUsers: fetchAllUsers,
       createUser: createUser
        
    };

    return factory;
    
    function fetchAllUsers() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Users');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    
    function createUser(user) {
        var deferred = $q.defer();
        console.log('inside user service')
        $http.post(REST_SERVICE_URI, user)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating User');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }


    
}]);
