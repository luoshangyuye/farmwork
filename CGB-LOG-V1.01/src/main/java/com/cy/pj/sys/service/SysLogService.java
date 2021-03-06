package com.cy.pj.sys.service;

import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.entity.SysLog;

public interface SysLogService {
	/**
	 * 分页查询用户行为日志信息
     * @param username (页面上传过来的查询条件)
     * @param pageCurrent 当前页码值
     * @return 封装了日志记录以及分页信息的对象
     */
	PageObject<SysLog> findPageObjects(String username, Integer pageCurrent);
	
	int deleteObjects(Integer... ids);
}
