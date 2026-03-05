package com.ruoyi.project.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.project.purchase.domain.BasePurchase;
import com.ruoyi.project.purchase.service.IPurchaseService;
import com.yuque.common.ApiResult;

/**
 * 采用Get方便测试, 使用/ruoyi 前缀跳过登录验证
 */
@RestController
@RequestMapping("/ruoyi/purchase/v1")
public class PurchaseController {

	@Autowired
	private IPurchaseService purchaseService;

	/**
	 * 请求Purchase分页数据
	 */
	@GetMapping(value={"/list", "/list/{pageIndex}"})
	public ApiResult<List<BasePurchase>> purchaseList(@PathVariable(required=false) Integer pageIndex, @RequestParam(required = false, defaultValue="15") Integer pageSize) {
		if(pageIndex==null) pageIndex=1;
		System.out.println("Check param:"+pageIndex+", "+pageSize);
		List<BasePurchase> rs = purchaseService.findPurchases(pageIndex, pageSize);
		return ApiResult.success(rs);
	}

	/**
	 * 请求读取Purchase信息
	 * @param id
	 * @return
	 */
	@GetMapping("/r/{id}")
	public ApiResult<BasePurchase> detailPurchase(@PathVariable Long id) {
		BasePurchase rs = purchaseService.findPurchaseById(id);
		return ApiResult.success(rs);
	}
	
	/**
	 * 创建保存Purchase信息
	 * @param purchase
	 * @return
	 */
	@PostMapping("/c/save")
	public ApiResult<String> createSavePurchase(BasePurchase purchase) {
		int count=purchaseService.createPurchase(purchase);
		return ApiResult.success("Create record count:"+count);
	}
	/**
	 * 编辑保存Purchase信息
	 * @param purchase
	 * @return
	 */
	@PostMapping("/e/save")
	public ApiResult<String> editSavePurchase(BasePurchase purchase) {
		int count=purchaseService.modifyPurchase(purchase);
		return ApiResult.success("Update record count:"+count);
	}
	/**
	 * 使Purchase可用
	 * @param id
	 * @return
	 */
	@GetMapping("/enable/{id}")
	public ApiResult<BasePurchase> enablePurchase(@PathVariable Long id) {
		BasePurchase purchase=purchaseService.findPurchaseById(id);
		purchase.setUseFlag(1);
		purchaseService.modifyPurchase(purchase);
		return ApiResult.success(purchase);
	}
	/**
	 * 使Purchase不可用
	 * @param id
	 * @return
	 */
	@GetMapping("/disable/{id}")
	public ApiResult<BasePurchase> disablePurchase(@PathVariable Long id) {
		BasePurchase purchase=purchaseService.findPurchaseById(id);
		purchase.setUseFlag(0);
		purchaseService.modifyPurchase(purchase);
		return ApiResult.success(purchase);
	}
}
