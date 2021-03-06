package com.mnet.exam.member.dao;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.mybatis.spring.SqlSessionTemplate;

public interface MemberDAO {
	
	// 로그인 처리
	public boolean loginCheck(Map<String, Object> map);
	
	//로그아웃처리
//	public void logout(HttpSession session);
	
	//아이디 중복체크 처리
	public int idCheck(Map<String, Object> map);
	
	//회원가입처리 아이디 비밀번호 성명 db에 저장
	public void join(Map<String, Object> map);
	
	// 회원 가입 상세 페이지 처리 
	public void joinDetail(Map<String, Object> map);

}
