angular.module('app')

.controller('HomeCtrl', function($scope, $rootScope, $location)
{
   $rootScope.activetab = $location.path();
});
 
angular.module('app').controller('SobreCtrl', function($rootScope, $location)
{
   $rootScope.activetab = $location.path();
});
 
angular.module('app').controller('ContatoCtrl', function($rootScope, $location)
{
   $rootScope.activetab = $location.path();
});
angular.module('app').controller('PaiCtrl', function($rootScope, $location)
{
   $rootScope.activetab = $location.path();
});
angular.module('app').controller('FilhoCtrl', function($rootScope, $location)
{
   $rootScope.activetab = $location.path();
});
angular.module('app').controller('MesadaCtrl', function($rootScope, $location)
{
   $rootScope.activetab = $location.path();
});
