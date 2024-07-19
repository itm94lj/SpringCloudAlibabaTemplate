package org.itm94lj.template.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.itm94lj.template.common.api.CommonPage;
import org.itm94lj.template.common.api.CommonResult;
import org.itm94lj.template.demo.service.BrandService;
import org.itm94lj.template.model.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 品牌管理Controller
 */
@Controller
@Api(tags = "BrandController", description = "品牌管理Controller")
@RequestMapping("/brand")
@Slf4j
public class BrandController {

    @Autowired
    private BrandService brandService;

    @ApiOperation(value = "获取全部品牌列表")
    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<Brand>> getBrandList() {
        return CommonResult.success(brandService.listAllBrand());
    }

    @ApiOperation(value = "添加品牌")
    @RequestMapping(value="/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createBrand(@RequestBody Brand brand) {
        CommonResult commonResult;
        int count = brandService.createBrand(brand);
        if (count == 1) {
            commonResult = CommonResult.success(brand);
            log.debug("create brand success:{}", brand);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("create brand failed:{}", brand);
        }

        return commonResult;
    }

    @ApiOperation(value = "更新品牌")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBrand(@PathVariable("id") Long id,
                                    @RequestBody Brand brand,
                                    BindingResult result) {
        CommonResult commonResult;
        int count = brandService.updateBrand(id, brand);
        if (count == 1) {
            commonResult = CommonResult.success(brand);
            log.debug("update brand success:{}", brand);
        } else {
            commonResult = CommonResult.failed("操作失败");
            log.debug("update brand failed:{}", brand);
        }

        return commonResult;
    }

    @ApiOperation(value = "删除品牌")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = brandService.deleteBrand(id);
        if (count == 1) {
            log.debug("delete brand success :id={}", id);
            return CommonResult.success(null);
        } else {
            log.debug("delete brand faield :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation(value = "分页获取品牌列表")
    @RequestMapping(value="/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<Brand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                     @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<Brand> brandList = brandService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation(value = "根据编号查询品牌信息")
    @RequestMapping(value="/brand/{id}", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<Brand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(brandService.getBrand(id));
    }
}
