'use strict';

angular.module('myApp').controller('BlogController', ['$scope', 'BlogService', function($scope, BlogService) {
    var self = this;
    self.blog={blogName:'',contents:''};
    self.blogs=[];

    self.submit = submit;
  
    fetchAllBlogs();

    function fetchAllBlogs(){
    	BlogService.fetchAllBlogs()
            .then(
            function(d) {
                self.blogs = d;
            },
            function(errResponse){
                console.error('Error while fetching Blog');
            }
        );
    }


    function createBlog(blog){
    	console.log('inside blog controller');
        BlogService.createBlog(blog)
        .then(
        		fetchAllBlogs,
                function(errResponse){
                    console.error('Error while creating Blog');
                }
            );
                   
           
    }

    
    function submit() {
     /*   if(self.user.id===null){
            console.log('Saving New User', self.user);
    */       
    	createBlog(self.blog);
     /*   }else{
            updateUser(self.user, self.user.id);
            console.log('User updated with id ', self.user.id);
        }*/
        reset();
    }

    function reset(){
        self.blog={id:null,blogName:'',contents:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);
