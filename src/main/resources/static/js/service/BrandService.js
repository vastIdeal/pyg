app.service('brandService',function ($http) {

    this.findAll=function(pageNum,pageSize){
        return $http.get('../tbBrandController/findAll?pageNum='+pageNum+'&pageSize'+pageSize);
    }

})