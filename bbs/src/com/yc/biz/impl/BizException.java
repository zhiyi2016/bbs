package com.yc.biz.impl;

public class BizException extends Exception{

	/**
	 * 用户自定义的异常
	 */
	private static final long serialVersionUID = 1L;

	public BizException() {
		super();
	}

	public BizException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BizException(String message, Throwable cause) {
		super(message, cause);
	}

	public BizException(String message) {
		super(message);
	}

	public BizException(Throwable cause) {
		super(cause);
	}
	
}
