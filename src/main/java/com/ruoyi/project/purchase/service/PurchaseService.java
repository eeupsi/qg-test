package com.ruoyi.project.purchase.service;

import java.util.List;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.project.purchase.domain.BasePurchase;
import com.ruoyi.project.purchase.mapper.PurchaseMapper;

@Service
public class PurchaseService implements IPurchaseService {	
    private static final Logger log = LoggerFactory.getLogger(PurchaseService.class);

    @Autowired
    private PurchaseMapper purchaseMapper;

	@Override
	public List<BasePurchase> findPurchases(int pageIndex, int pageSize) {
		int offset=(pageIndex - 1) * pageSize;
		return purchaseMapper.selectPurchaseList(offset, pageSize);
	}
	
	@Override
	public BasePurchase findPurchaseById(Long id) {
		return purchaseMapper.selectPurchaseById(id);
	}
	
	@Override
	public int createPurchase(BasePurchase purchase) {
		validate(purchase);
		return purchaseMapper.insertPurchase(purchase);
	}
	
	@Override
	public int modifyPurchase(BasePurchase purchase) {
		validate(purchase);
		return purchaseMapper.updatePurchase(purchase);
	}
	
	private static void validate(BasePurchase purchase) {
		Validate.notBlank(String.valueOf(purchase.getId()), "Id can't be blank");
		Validate.notBlank(purchase.getName(), "Name can't be blank");
		Validate.notBlank(purchase.getTelephone(), "Telephone can't be blank");
	}
    
}
