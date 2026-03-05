package com.yuque.common;

import java.io.Serializable;

/**
 * 固定属性: code/message/data<br>
 * 不可扩展其它属性,
 * @param <T> 数据实体类型
 */
public class ApiResult<T extends Object> implements Serializable {
	private static final long serialVersionUID = 1L;

	/** 状态码 */
	private Object code;

	/** 返回内容 */
	private String message;

	/** 返回的数据集/对象 */
	private T context;
	
	/**
	 * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
	 */
	protected ApiResult() {
		//this(null, null, null);
	}

	/**
	 * 初始化一个新创建的 AjaxResult 对象 返回错误消息
	 * 
	 * @param code 状态码
	 * @param message  返回内容
	 * @param data 数据对象
	 */
	public ApiResult(Object code, String message, T data) {
		this.code = code;
		this.message = message;
		this.context = data;
	}
	
	public Object getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	public ApiResult<T> withMessage(String msg) {
		this.message=msg;
		return this;
	}

	public T getContext() {
		return context;
	}
	
	public static <T> ApiResult<T> result(String code, String msg, T data) {
		return new ApiResult<T>(code, msg, data);
	}

    public static <T> ApiResult<T> judge(boolean success) {
        return success? success(): failed();
    }
	////failed
	public static <T> ApiResult<T> failed() {
		return failed(null);
	}
	public static <T> ApiResult<T> failed(String msg) {
		return failed(msg, null);
	}
	public static <T> ApiResult<T> failed(String msg, T data) {
		return result("FAILED", msg, data);
	}
	
	////success
	public static <T> ApiResult<T> success() {
		return success(null);
	}
	public static <T> ApiResult<T> success(T data) {
		return success(null, data);
	}
	public static <T> ApiResult<T> success(String msg, T data) {
		return result("SUCCESS", msg, data);
	}
	
}
