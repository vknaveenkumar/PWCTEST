/**
 *
 * @author Schubert Generated Code</br>
 * Date Created: </br>
 * @since  </br>
   build:   </p>
 *
 * code was generated by the Schubert System </br>
 * Schubert system Copyright - NewPortBay LLC copy_right_range</br>
 * The generated code is free to use by anyone</p>
 *
 *
 *
*/

app.controller("OrangeTestDefaultActivity", [ '$scope', '$rootScope', '$location', '$window', '$q', '$http', 'RestURL',
				    function( $scope, $rootScope, $location, $window, $q, $http, RestURL) {

		$scope.Test = {
		id: '',
		name : ''
		};





		$scope.$on('$viewContentLoaded', function(event) {
			var biggestHeight = 0;
			var height = 0;
			$(".screen").find('*').each(function(){
				height = $(this).position().top + $(this).height() + 100;
				if (height > biggestHeight ) {
					biggestHeight = height;
				}
			});
			$(".screen").height(biggestHeight);
		});

		$scope.refresh_screen_height = function() {
			var biggestHeight = 0;
			var height = 0;
			$(".screen").find('*').each(function(){
				height = $(this).position().top + $(this).height() + 100;
				if (height > biggestHeight ) {
					biggestHeight = height;
				}
			});
			$(".screen").height(biggestHeight);
		};

}]);


