package com.cy.pj.sys.dao.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.common.vo.PageObject;
import com.cy.pj.sys.entity.SysLog;
import com.cy.pj.sys.service.SysLogService;

@SpringBootTest
public class SysLogServiceTests {
	@Autowired
	private SysLogService sysLogService;
	@Test
	public void testFindPageObjects() {
		PageObject<SysLog> po = sysLogService.findPageObjects("admin", 1);
		System.out.println(po.getPageCount());
	}
}
