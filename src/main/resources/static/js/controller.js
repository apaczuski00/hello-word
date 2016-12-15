app.controller('usersController', function($scope) {
	$scope.headingTitle = "User List";
});

// app.controller('rolesController', function($scope) {
//	
// $scope.headingTitle = "Roles List";
// });

app.controller('rolesController', [ '$scope', '$http', function($scope, $http) {
	$http({
		method : 'GET',
		url : '/controler/get'
	}).success(function(data) {
		$scope.headingTitle = data.name;
	}).error(function() {
		$scope.headingTitle = "ZLEEE";
	});
} ])
