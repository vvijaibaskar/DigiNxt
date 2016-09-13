'use strict';

angular.module('myApp').controller('UserController', ['$scope', 'UserService', function($scope, UserService) {
    var self = this;
    self.user={name:'',id:'',password:'',phone:'',yearOfJoin:'',niitRollNo:'',email:'',status:'N'};
    self.users=[];

    self.submit = submit;
  
    fetchAllUsers();

    function fetchAllUsers(){
        UserService.fetchAllUsers()
            .then(
            function(d) {
                self.users = d;
            },
            function(errResponse){
                console.error('Error while fetching Users');
            }
        );
    }


    function createUser(user){
    	console.log('inside controller');
        UserService.createUser(user)
        .then(
                fetchAllUsers,
                function(errResponse){
                    console.error('Error while creating User');
                }
            );
                   
           
    }

    
    function submit() {
     /*   if(self.user.id===null){
            console.log('Saving New User', self.user);
    */       
    	createUser(self.user);
     /*   }else{
            updateUser(self.user, self.user.id);
            console.log('User updated with id ', self.user.id);
        }*/
        reset();
    }

    function reset(){
        self.user={id:null,username:'',address:'',email:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);
