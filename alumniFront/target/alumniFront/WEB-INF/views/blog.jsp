<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>  
    <title>Blog Details</title>  
    <style>
      .blogName.ng-valid {
          background-color: lightgreen;
      }
      .blogName.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .blogName.ng-dirty.ng-invalid-minlength {
          background-color: yellow;
      }

      .contents.ng-valid {
          background-color: lightgreen;
      }
      .contents.ng-dirty.ng-invalid-required {
          background-color: red;
      }
      .contents.ng-dirty.ng-invalid-email {
          background-color: yellow;
      }

    </style>
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
     <link href="<c:url value='/static/css/app.css' />" rel="stylesheet"></link>
  </head>
  <body ng-app="myApp" class="ng-cloak">
      <div class="generic-container" ng-controller="BlogController as ctrl">
          <div class="panel panel-default">
              <div class="panel-heading"><span class="lead">Blog Entry Form</span></div>
              <div class="formcontainer">
                  <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
                      
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">BlogName</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.blog.blogName" class="form-control input-sm" placeholder="Enter your Blog Name[This field is validation free]"/>
                              </div>
                          </div>
                      </div>
  
                       
                       <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">contents</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="ctrl.blog.contents" class="form-control input-sm" placeholder="Enter your Blog details[This field is validation free]"/>
                              </div>
                          </div>
                      </div>
                      
    

                      <div class="row">
                          <div class="form-actions floatRight">
                              <input type="submit"  value="{{!ctrl.blog.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid">
                              <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
                          </div>
                      </div>
                  </form>
              </div>
          </div>
          <div class="panel panel-default">
                <!-- Default panel contents -->
              <div class="panel-heading"><span class="lead">Blog Details </span></div>
              <div class="tablecontainer">
                  <table class="table table-hover">
                      <thead>
                          <tr>
                              <th>ID.</th>
                              <th>Name</th>
                              <th>Contents</th>
                              <th width="20%"></th>
                          </tr>
                      </thead>
                      <tbody>
                          <tr ng-repeat="bl in ctrl.blogs">
                              <td><span ng-bind="bl.id"></span></td>
                              <td><span ng-bind="bl.blogName"></span></td>
                              <td><span ng-bind="bl.contents"></span></td>
                              <td>
                         <!--      <button type="button" ng-click="ctrl.edit(bl.id)" class="btn btn-success custom-width">Edit</button>  <button type="button" ng-click="ctrl.remove(bl.id)" class="btn btn-danger custom-width">Remove</button>
                        -->       </td>
                          </tr>
                      </tbody>
                  </table>
              </div>
          </div>
      </div>
      
      <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
      <script src="<c:url value='/static/js/app.js' />"></script>
      <script src="<c:url value='/static/js/service/blog_service.js' />"></script>
      <script src="<c:url value='/static/js/controller/blog_controller.js' />"></script>
  </body>
</html>