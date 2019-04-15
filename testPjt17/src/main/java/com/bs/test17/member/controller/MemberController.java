package com.bs.test17.member.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bs.test17.member.Member;
import com.bs.test17.member.service.MemberService;

@Controller
public class MemberController {
	
	@Resource(name="memberService")
	MemberService service;
	
	// Controller이기 때문에 Mapping이 아주 중요 !
	@RequestMapping(value="/memJoin", method=RequestMethod.POST)
	public String memJoin(Member member) { // Member : 커맨드 객체. setter가 적용됨!
//		String memId = request.getParameter("memId");
//		String memPw = request.getParameter("memPw");
//		String memMail = request.getParameter("memMail");
//		String memPhone1 = request.getParameter("memPhone1");
//		String memPhone2 = request.getParameter("memPhone2");
//		String memPhone3 = request.getParameter("memPhone3");
//		
		// service가 실질적으로 일을 하겠죠?
		service.memberRegister(member.getMemId(), member.getMemPw(), member.getMemMail()
				, member.getMemPhone1(), member.getMemPhone2(), member.getMemPhone3());
		
		return "memJoinOk";
	}
	
	@RequestMapping(value="/memLogin", method=RequestMethod.POST)
	public String memLogin(Model model, @RequestParam("memId") String memId,
										@RequestParam("memPw") String memPw) {
//		String memId = request.getParameter("memId");
//		String memPw = request.getParameter("memPw");
		
		Member member = service.memberSearch(memId, memPw);
		
		System.out.println(memId);
		System.out.println(memPw);
		
		System.out.println(member);
		try {
			model.addAttribute("memId", member.getMemId());
			model.addAttribute("memPw", member.getMemPw());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "memLoginOk";
	}
}
