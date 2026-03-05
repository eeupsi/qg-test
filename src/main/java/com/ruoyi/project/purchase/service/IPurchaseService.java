package com.ruoyi.project.purchase.service;

import java.util.List;

import com.ruoyi.project.purchase.domain.BasePurchase;

public interface IPurchaseService {

    /**
     * 分页查询Purchase列表信息
     */
    public List<BasePurchase> findPurchases(int pageIndex, int pageSize);

    /**
     * 通过ID查询采购员信息
     */
    public BasePurchase findPurchaseById(Long id);
    
    /**
     * 创建采购员信息, 返回新增后的全量信息
     */
    public int createPurchase(BasePurchase purchase);

    /**
     * 修改采购员信息, 返回修改后的全量信息
     */
    public int modifyPurchase(BasePurchase purchase);
}
