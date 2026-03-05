package com.ruoyi.project.purchase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ruoyi.project.purchase.domain.BasePurchase;

/**
 * 采购员表 数据层
 */
public interface PurchaseMapper
{
    /**
     * 分页查询采购员列表
     * 
     * @return 采购员集合信息
     */
    public List<BasePurchase> selectPurchaseList(@Param("offset") int offset, @Param("pageSize") int pageSize);

    /**
     * 通过ID查询采购员
     * 
     * @param purchaseId 采购员Id
     * @return 采购员信息
     */
    public BasePurchase selectPurchaseById(Long id);

    /**
     * 新增采购员
     * 
     * @param purchase 采购员
     * @return 影响结果数量
     */
    public int insertPurchase(BasePurchase purchase);

    /**
     * 修改采购员
     * 
     * @param purchase 采购员
     * @return 影响结果数量
     */
    public int updatePurchase(BasePurchase purchase);

}
