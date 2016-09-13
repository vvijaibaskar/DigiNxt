'use strict';

angular.module('myApp').controller('EventController', ['$scope', 'EventService', function($scope, EventService) {
    var self = this;
    self.event={name:'',id:'',eventDate:'',venue:'',description:''};
    self.events=[];

    self.submit = submit;
  
    fetchAllEvents();

    function fetchAllEvents(){
        EventService.fetchAllEvents()
            .then(
            function(d) {
                self.events = d;
            },
            function(errResponse){
                console.error('Error while fetching Events');
            }
        );
    }


    function createEvent(event){
    	console.log('inside event controller');
        EventService.createEvent(event)
        .then(
                fetchAllEvents,
                function(errResponse){
                    console.error('Error while creating Event');
                }
            );
                   
           
    }

    
    function submit() {
     /*   if(self.user.id===null){
            console.log('Saving New User', self.user);
    */       
    	createEvent(self.event);
     /*   }else{
            updateUser(self.user, self.user.id);
            console.log('User updated with id ', self.user.id);
        }*/
        reset();
    }

    function reset(){
        self.event={name:'',id:'',eventDate:'',venue:'',description:''};
        $scope.myForm.$setPristine(); //reset Form
    }

}]);
