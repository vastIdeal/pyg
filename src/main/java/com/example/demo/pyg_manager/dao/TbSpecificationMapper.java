package com.example.demo.pyg_manager.dao;

import com.example.demo.pyg_manager.domain.TbSpecification;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbSpecificationMapper  {

    public List<TbSpecification> findAll();

}
