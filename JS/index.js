var scotchApp = angular.module('RoutingApp', ['ngRoute']);  
scotchApp.constant("baseUrl","http://localhost:8080/mainpage.html");

scotchApp.config([ '$routeProvider', '$locationProvider',
    function($routeProvider, $locationProvider) {
        $routeProvider
        .when('/', {  
            templateUrl: 'index.html',  
            controller: 'mainController'  
        })  
      
        // route for the about page    
        .when('/login', {  
            templateUrl: 'login.html',  
            controller: 'aboutController'  
        })  
      
        // route for the contact page    
        .when('/register', {  
            templateUrl: 'mainpage.html',  
            controller: 'contactController'  
        })
        
        .otherwise({
        redirectTo:'/'
        });  
    }
]);

scotchApp.controller('mainController', function($scope) {  
    // create a message to display in our view    
    $scope.HomeMessage = 'Home Controller Called !!!';  
});  
  
scotchApp.controller('aboutController', function($scope) {  
    $scope.AboutMessage = 'About Controller Called !!!';  
});  
  
scotchApp.controller('contactController', function($scope) {  
    $scope.ContactMessage = 'Contact Controller Called !!!';  
});  