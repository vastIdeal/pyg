package com.example.demo.pyg_manager.service.impl;

import com.example.demo.pyg_manager.dao.TbSpecificationMapper;
import com.example.demo.pyg_manager.domain.TbSpecification;
import com.example.demo.pyg_manager.service.TbSpecificationService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TbSpecificationServiceImpl implements TbSpecificationService {

    @Autowired
    private TbSpecificationMapper tbSpecificationMapper;

    @Override
    public PageInfo<TbSpecification> findAll(Integer pageNum , Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<TbSpecification> list = tbSpecificationMapper.findAll();
        PageInfo<TbSpecification> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
