'use strict';

angular.module('myApp').factory('BlogService', ['$http', '$q', function($http, $q){

	var REST_SERVICE_URI = 'http://localhost:8081/alumni/blog11/';

    var factory = {
        
       fetchAllBlogs: fetchAllBlogs,
       createBlog: createBlog
        
    };

    return factory;
    
    function fetchAllBlogs() {
        var deferred = $q.defer();
        $http.get(REST_SERVICE_URI)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while fetching Blogs');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }

    
    function createBlog(blog) {
        var deferred = $q.defer();
        console.log('inside blog service')
        $http.post(REST_SERVICE_URI, blog)
            .then(
            function (response) {
                deferred.resolve(response.data);
            },
            function(errResponse){
                console.error('Error while creating Blog');
                deferred.reject(errResponse);
            }
        );
        return deferred.promise;
    }


    
}]);
