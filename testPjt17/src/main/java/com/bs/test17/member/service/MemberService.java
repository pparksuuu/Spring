package com.bs.test17.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.bs.test17.member.Member;
import com.bs.test17.member.dao.MemberDao;

 @Service
// @Component
// @Repository 
public class MemberService implements IMemberService{
	
	@Autowired
	MemberDao dao;
	
//	MemberService service = new MemberService();  -> 이게 순수 자바로 짤 때, 스프링 사용 안할 때.

	@Override
	public void memberRegister(String memId, String memPw, String memMail, String memPhone1, String memPhone2,
			String memPhone3) {
		System.out.println("memberRegister()");
		System.out.println("memberId : " + memId);
		System.out.println("memPw : " + memPw);
		System.out.println("memMail : " + memMail);
		System.out.println("memPhone : " + memPhone1 + " - " + memPhone2 + " - " + memPhone3);
		
		dao.memberInsert(memId, memPw, memMail, memPhone1, memPhone2, memPhone3);
	}

	@Override
	public Member memberSearch(String memId, String memPw) {
		System.out.println("memberSearch()");
		System.out.println("memId : " + memId);
		System.out.println("memPw : " + memPw);
		
		Member member = dao.memberSelect(memId, memPw);
		
		return member;
	}

	@Override
	public void memberModify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void memberRemove() {
		// TODO Auto-generated method stub
		
	}

}
