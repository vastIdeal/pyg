package com.example.demo.pyg_manager.service;

import com.example.demo.pyg_manager.domain.TbBrand;
import com.github.pagehelper.PageInfo;

public interface TbBrandService {

    public PageInfo<TbBrand> findAll(Integer pageNum, Integer pageSize);
}
