package com.cy.pj.common.vo;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * vo对象
 * 设计此对象的目的是封装控制层要响应到客户端的数据
 */
@Data
@NoArgsConstructor
public class JsonResult implements Serializable {
	private static final long serialVersionUID = 2080943344863436345L;
	/** 状态码(服务端响应客户端的状态码) */
	private int state = 1;// 1代表ok,0代表error
	/** 状态信息 */
	private String message = "ok";
	/** 表示响应到客户端的数据 */
	private Object data;

	public JsonResult(String message) {
		this.message = message;
	}

	/** 一般查询时调用，封装查询结果 */
	public JsonResult(Object data) {
		this.data = data;
	}

	/** 出现异常时时调用 */
	public JsonResult(Throwable t) {
		this.state = 0;//表示异常
		this.message = t.getMessage();
	}
}
