package com.example.demo.pyg_manager.controller;

import com.example.demo.common.utils.Constant;
import com.example.demo.common.utils.Result;
import com.example.demo.pyg_manager.domain.TbBrand;
import com.example.demo.pyg_manager.domain.TbSpecification;
import com.example.demo.pyg_manager.service.TbSpecificationService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/specification")
public class TbSpecificationController {

    @Autowired
    private TbSpecificationService tbSpecificationService ;

    @RequestMapping("/findAll")
    public Result findAll(Integer pageNum , Integer pageSize){
        Result result = new Result();
        try{
            PageInfo<TbSpecification> pageInfo = tbSpecificationService.findAll(pageNum,pageSize);
            result.setStatus(Constant.PAGE_STATUS_SUCCESS);
            result.setData(pageInfo.getList());
            result.setMessage("");
        }catch (Exception e){
            e.printStackTrace();   //打印异常信息
            result.setStatus(Constant.PAGE_STATUS_FAILURE);
            result.setData("");
            result.setMessage(e.getMessage());
        }
        return result;
    }
}
