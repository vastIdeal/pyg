app.controller('brandController',function ($scope,$brandService) {

    $scope.init = function(){
        $scope.result = {TbBrand:{}} ;
    }

    $scope.findAll = function (pageNum,pageSize) {
        brandService.findAll(pageNum,pageSize).success(
            function (response) {
                $scope.result = response;
            }
        )
    }

});