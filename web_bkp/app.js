'use strict';

var BASE_URL = 'http://localhost:8080/api';

angular.module('app', ['ngRoute'])
  .constant('SERVICE_PATH', {
    'ROOT_PATH': BASE_URL,
    'PUBLIC_PATH': BASE_URL + '/public',
    'PRIVATE_PATH': BASE_URL + '/private'
  })
  
.config(function($routeProvider, $locationProvider, $httpProvider)
{
   // remove o # da url
   $locationProvider.html5Mode(true);
 
   $routeProvider
 
   // para a rota '/', carregaremos o template home.html e o controller 'HomeCtrl'
   .when('/', {
      templateUrl : '/views/home/home.html',
      controller     : 'HomeCtrl',
   })
 
   // para a rota '/sobre', carregaremos o template sobre.html e o controller 'SobreCtrl'
   .when('/sobre', {
      templateUrl : '/views/sobre.html',
      controller  : 'SobreCtrl',
   })
 
   // para a rota '/contato', carregaremos o template contato.html e o controller 'ContatoCtrl'
   .when('/pai', {
      templateUrl : '/views/pai/pai.html',
      controller  : 'PaiCtrl',
   })

    .when('/filho', {
      templateUrl : '/views/filho/filho.html',
      controller  : 'FilhoCtrl',
   })

    .when('/mesada', {
      templateUrl : '/views/mesada/mesada.html',
      controller  : 'MesadaCtrl',
   })

    .when('/contato', {
      templateUrl : '/views/contato.html',
      controller  : 'ContatoCtrl',
   })
 
   // caso não seja nenhum desses, redirecione para a rota '/'
   .otherwise ({ redirectTo: '/' });

   $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
});