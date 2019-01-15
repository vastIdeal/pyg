package com.example.demo.pyg_manager.controller;

import com.example.demo.common.utils.Constant;
import com.example.demo.common.utils.Result;
import com.example.demo.pyg_manager.domain.TbBrand;
import com.example.demo.pyg_manager.service.TbBrandService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tbBrandController")
public class TbBrandController {

    @Autowired
    private TbBrandService tbBrandService;

    @RequestMapping("/findAll")
    public Result findAll(Integer pageNum , Integer pageSize){
        Result result = new Result();
        try{
            PageInfo<TbBrand> pageInfo = tbBrandService.findAll(pageNum,pageSize);
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
