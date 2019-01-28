angular.module('myApp', []).controller('register', function($scope) {
$scope.fields=[
    "First Name",
    "Middle Name",
    "Last Name"
];

$scope.category=[
    "General",
    "OBC",
    "SC",
    "ST"
];
});