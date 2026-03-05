package com.ruoyi.project.purchase.domain;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 采购员实体对象
 */
public class BasePurchase implements Serializable{
	private static final long serialVersionUID = 1L;

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
	private int useFlag=1;
	/**
	 * 创建人id
	 */
	private Long createUserId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新人id
	 */
	private Long updateUserId;
	/**
	 * 更新时间
	 */
	private Date updateTime;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getUpdateUserId() {
		return updateUserId;
	}
	public void setUpdateUserId(Long updateUserId) {
		this.updateUserId = updateUserId;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", this.getId())
            .append("name", this.getName())
            .append("telephone", this.getTelephone())
            .append("useFlag", this.getUseFlag())
            .append("createUserId", this.getCreateUserId())
            .append("createTime", this.getCreateTime())
            .append("updateUserId", this.getUpdateUserId())
            .append("updateTime", this.getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
