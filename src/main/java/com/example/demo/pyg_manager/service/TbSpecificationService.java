package com.example.demo.pyg_manager.service;

import com.example.demo.pyg_manager.domain.TbSpecification;
import com.github.pagehelper.PageInfo;

public interface TbSpecificationService {

    public PageInfo<TbSpecification> findAll(Integer pageNum , Integer pageSize);

}
