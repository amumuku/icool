package com.general.freight.dal.dao;


import com.general.freight.dal.bean.Brand;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author szy on 18/4/27.
 */
@Mapper
public interface BrandMapper {

    Brand selectByPrimaryKey(Integer brandId);
}
