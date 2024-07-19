package org.itm94lj.template.demo.service;

import org.itm94lj.template.model.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> listAllBrand();
    int createBrand(Brand brand);
    int updateBrand(Long id, Brand brand);
    int deleteBrand(Long id);
    List<Brand> listBrand(int pageNum, int pageSize);
    Brand getBrand(Long id);
}
