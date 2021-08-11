package com.dh.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dh.dto.MemberDto;
import com.dh.service.MemberService;

@Controller
public class HomeController {
	@Autowired
	MemberService service;
	@RequestMapping(value = "/first", method = RequestMethod.GET)
	public String home() {
		
		
		return "home";
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert() {
		
		
		return "insert";
	}
	@RequestMapping(value = "/insert2", method = RequestMethod.GET)
	public String insert2(MemberDto dto) {
		service.insert(dto);
		
		return "home";
	}
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(String id,String pw,HttpServletRequest request,Model model) {
		String ret = "";
		HttpSession session = request.getSession();
	if(service.select(id, pw)) {
		session.setAttribute("id", id);		
		if(id.equals("admin")) {			
			ret = "admin";
			model.addAttribute("list",service.selectAll());
		}else {
			MemberDto dto = service.selectUpdate(id);
			request.setAttribute("id",dto.getId());
			request.setAttribute("name",dto.getName());
			request.setAttribute("point",dto.getPoint());

			ret = "main";
		}
		return ret;		
	}else {
		request.setAttribute("msg", "아이디/비밀번호를 확인해주세요");
		return "loginX";
	}
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(String id,Model model) {
		service.delete(id);
		model.addAttribute("list",service.selectAll());
		return "admin";
	}
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Model model,String id) {
		model.addAttribute("list", service.selectUpdate(id));

		return "update";
	}
	@RequestMapping(value = "/afterUpdate", method = RequestMethod.GET)
	public String home9(String id,String pw,String name,String choice,Model model) {
		service.update(id,pw,name,choice);
		model.addAttribute("list", service.selectAll());
		return "admin";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "home";
	}
}
