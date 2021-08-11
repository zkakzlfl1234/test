package com.dh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dh.dao.MemberDao;
import com.dh.dto.MemberDto;

public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDao dao;
	@Override
	public boolean select(String id, String pw) {
		
		return dao.select(id, pw)==1;
	}
	@Override
	public boolean insert(MemberDto dto) {
		
		return dao.insert(dto)==1;
	}
	@Override
	public List<MemberDto> selectAll() {
		
		return dao.selectAll();
	}
	@Override
	public boolean delete(String id) {
		
		return dao.delete(id)==1;
	}
	@Override
	public boolean update(String id, String pw, String name, String choice) {
		
		return dao.update(id, pw, name, choice)==1;
	}
	@Override
	public MemberDto selectUpdate(String id) {
		
		return dao.selectUpdate(id);
	}

}
