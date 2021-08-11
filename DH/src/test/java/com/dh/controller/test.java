package com.dh.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dh.dao.MemberDao;
import com.dh.dto.MemberDto;
import com.dh.service.MemberService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class test {
	@Autowired
	private MemberDao dao;
	@Autowired
	private MemberService service;
	
	@Test
	public void testSelect() throws Exception {
		int result = dao.select("id1", "1234");
		System.out.println(result);
	}
	@Test
	public void testSelectService() throws Exception {
		boolean result = service.select("id1", "1234");
		System.out.println(result);
	}
	@Test
	public void testInsert() throws Exception {
		int result = dao.insert(new MemberDto("zkakzlfl1234","1234","±ËµŒ",1000));
		System.out.println(result);
	}
	@Test
	public void testInsertService() throws Exception {
		boolean result = service.insert(new MemberDto("zkakzlfl12345","12345","±ËµŒ»∆",1000));
		System.out.println(result);
	}
	@Test
	public void testSelectAll() throws Exception {
		System.out.println(dao.selectAll());
	}
	@Test
	public void testSelectAllService() throws Exception {
		System.out.println(service.selectAll());
	}
	@Test
	public void testDelete() throws Exception {
		int result = dao.delete("delete");
		System.out.println(result);
	}
	@Test
	public void testDeleteService() throws Exception {
		boolean result = service.delete("delete");
		System.out.println(result);
	}
	@Test
	public void testUpdate() throws Exception {
		int result = dao.update("good", "1234", "job", "zkakzlfl1234");
		System.out.println(result);
	}
	@Test
	public void testUpdateService() throws Exception {
		boolean result = service.update("zkakzlfl1234", "1234", "job", "good");
		System.out.println(result);
	}
	@Test
	public void testselectUpdate() throws Exception {
		MemberDto result = dao.selectUpdate("good");
		System.out.println(result);
	}
	@Test
	public void testselectUpdateService() throws Exception {
		MemberDto result = service.selectUpdate("good");
		System.out.println(result);
	}
}
