package com.ruoyi.project.purchase.vi;

import net.sf.jsqlparser.expression.DateTimeLiteralExpression.DateTime;

public class PurchaseVi {

	/**
	 * 数据记录标识
	 */
	private Long id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 电话
	 */
	private String telephone;
	/**
	 * 是否启用 0:否 1:是
	 */
	private int useFlag;
	/**
	 * 创建人id
	 */
	private Long createUserId;
	/**
	 * 创建时间
	 */
	private DateTime createTime;
	/**
	 * 更新人id
	 */
	private Long updateUserId;
	/**
	 * 更新时间
	 */
	private DateTime updateTime;
	/**
	 * 备注信息
	 */
	private String remark;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public int getUseFlag() {
		return useFlag;
	}
	public void setUseFlag(int useFlag) {
		this.useFlag = useFlag;
	}
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public DateTime getCreateTime() {
		return createTime;
	}
	public void setCreateTime(DateTime createTime) {
		this.createTime = createTime;
	}
	public Long getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}
	public DateTime getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(DateTime updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
