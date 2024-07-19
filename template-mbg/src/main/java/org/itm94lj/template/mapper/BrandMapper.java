package org.itm94lj.template.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.itm94lj.template.model.Brand;
import org.itm94lj.template.model.BrandExample;

public interface BrandMapper {
    long countByExample(BrandExample example);

    int deleteByExample(BrandExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Brand row);

    int insertSelective(Brand row);

    List<Brand> selectByExampleWithBLOBs(BrandExample example);

    List<Brand> selectByExample(BrandExample example);

    Brand selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") Brand row, @Param("example") BrandExample example);

    int updateByExampleWithBLOBs(@Param("row") Brand row, @Param("example") BrandExample example);

    int updateByExample(@Param("row") Brand row, @Param("example") BrandExample example);

    int updateByPrimaryKeySelective(Brand row);

    int updateByPrimaryKeyWithBLOBs(Brand row);

    int updateByPrimaryKey(Brand row);
}