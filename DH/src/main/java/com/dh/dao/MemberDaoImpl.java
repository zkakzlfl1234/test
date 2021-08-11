package com.dh.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.dh.dto.MemberDto;

public class MemberDaoImpl implements MemberDao {
	@Autowired
	SqlSession sqlSession;
	@Override
	public int select(String id, String pw) {
		HashMap<String,String>map1 = new HashMap<String,String>();
		map1.put("id", id);
		map1.put("pw", pw);
		 return sqlSession.selectOne("com.dh.mapper.memberMapper.login",map1);
		
	}
	@Override
	public int insert(MemberDto dto) {
		
		return sqlSession.insert("com.dh.mapper.memberMapper.insert", dto);
	}
	@Override
	public List<MemberDto> selectAll() {
		
		return sqlSession.selectList("com.dh.mapper.memberMapper.selectAll");
	}
	@Override
	public int delete(String id) {
		return sqlSession.delete("com.dh.mapper.memberMapper.delete",id);
	}
	@Override
	public int update(String id, String pw, String name, String choice) {
		HashMap<String,String>map1 = new HashMap<String,String>();
		map1.put("id", id);
		map1.put("pw", pw);
		map1.put("name", name);
		map1.put("choice", choice);
		return sqlSession.update("com.dh.mapper.memberMapper.update",map1 );
	}
	@Override
	public MemberDto selectUpdate(String id) {
		
		return sqlSession.selectOne("com.dh.mapper.memberMapper.selectUpdate",id);
	}

}
