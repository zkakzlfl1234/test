package com.dh.dao;

import java.util.List;

import com.dh.dto.MemberDto;

public interface MemberDao {
	int select(String id,String pw);
	int insert(MemberDto dto);
	List<MemberDto>selectAll();
	int delete(String id);
	int update(String id,String pw,String name,String choice);
	MemberDto selectUpdate(String id);
}
