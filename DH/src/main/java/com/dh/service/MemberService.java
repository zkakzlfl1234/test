package com.dh.service;

import java.util.List;

import com.dh.dto.MemberDto;

public interface MemberService {
	boolean select(String id,String pw);
	boolean insert(MemberDto dto);
	List<MemberDto>selectAll();
	boolean delete(String id);
	boolean update(String id,String pw,String name,String choice);
	MemberDto selectUpdate(String id);
}
