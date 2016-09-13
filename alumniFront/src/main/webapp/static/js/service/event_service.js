'use strict';

angular.module('myApp').factory('EventService', ['$http', '$q', function($http, $q){

 	var REST_SERVICE_URI = 'http://localhost:8081/alumni/event11/';

    var factory = {
        
       fetchAllEvents: fetchAllEvents,
       createEvent: createEvent
        
    };

    return factory;
    
    function fetchAllEvents() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Events');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    
    function createEvent(event) {
        var deferred = $q.defer();
        console.log('inside event service')
        $http.post(REST_SERVICE_URI, event)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating Event');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }


    
}]);
