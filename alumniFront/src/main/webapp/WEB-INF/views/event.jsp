<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>Event Details</title>  
    <style>
      .name.ng-valid {
          background-color: lightgreen;
      }
      .name.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .name.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

      .id.ng-valid {
          background-color: lightgreen;
      }
      .id.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .id.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }

    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  </head>
  <body ng-app="myApp" class="ng-cloak">
      <div class="generic-container" ng-controller="EventController as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">Events details </span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
  
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Name</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.event.name" name="name" class="name form-control input-sm" placeholder="Enter Event name" required ng-minlength="3"/>
                               </div>
                          </div>
                      </div>
                        
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Event Id</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.event.id" class="form-control input-sm" placeholder="Enter the event ID"/>
                              </div>
                          </div>
                      </div>
                       
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">description</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.event.description" class="form-control input-sm" placeholder="Enter Event Description"/>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">venue</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.event.venue" class="form-control input-sm" placeholder="Enter the venue"/>
                              </div>
                          </div>
                      </div>
                      
      
                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="{{!ctrl.event.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
                          </div>
                      </div>
                      
                  </form>
              </div>
          </div>
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">List of Events </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>ID.</th>
                              <th>Name</th>
                              <th>Date</th>
                              <th>Venue</th>
                               <th>Description</th>
                              <th width="20%"></th>
                          </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="e in ctrl.events">
                              <td><span ng-bind="e.id"></span></td>
                              <td><span ng-bind="e.name"></span></td>
                              <td><span ng-bind="e.eventDate"></span></td>
                              <td><span ng-bind="e.venue"></span></td>
                              <td><span ng-bind="e.description"></span></td>
                              <td>
                              <button type="button" ng-click="ctrl.edit(e.id)" class="btn btn-success custom-width">Edit</button>  <button type="button" ng-click="ctrl.remove(e.id)" class="btn btn-danger custom-width">Remove</button>
                              </td>
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
      </div>
      
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/event_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/event_controller.js' />"></script>
  </body>
</html>