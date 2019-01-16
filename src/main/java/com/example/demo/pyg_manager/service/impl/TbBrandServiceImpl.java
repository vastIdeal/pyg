package com.example.demo.pyg_manager.service.impl;

import com.example.demo.pyg_manager.dao.TbBrandMapper;
import com.example.demo.pyg_manager.domain.TbBrand;
import com.example.demo.pyg_manager.service.TbBrandService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbBrandServiceImpl implements TbBrandService {

    @Autowired
    private TbBrandMapper tbBrandMapper ;

    @Override
    public PageInfo<TbBrand> findAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TbBrand> tbBrandList = tbBrandMapper.findAll();
        PageInfo<TbBrand> pageInfo = new PageInfo<>(tbBrandList);
        return pageInfo;
    }
}
