package com.example.demo.pyg_manager.dao;

import com.example.demo.pyg_manager.domain.TbBrand;

import java.util.List;



public interface TbBrandMapper {

    /**
     *  查询全部品牌
     * @return
     */
    public List<TbBrand> findAll();

}
