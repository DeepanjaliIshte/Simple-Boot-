package com.example.MyFirstBootApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class IndexController 
{
	@RequestMapping("/index")
	public String index() 
	{
		return "index";
	}
	
	/*
	 * //1st approach
	 * 
	 * @RequestMapping("/result") public String index(HttpServletRequest request) {
	 * System.out.println("Value : "+request.getParameter("data")); HttpSession
	 * session =request.getSession();
	 * session.setAttribute("value",request.getParameter("data")); return "result";
	 * }
	 */
	
	/*
	 * //2nd way
	 * 
	 * @RequestMapping("/result") public String index(@RequestParam("val")String
	 * data) { Map<String, String> map=new HashMap<String, String>();
	 * map.put("value", "data"); return "result"; }
	 */
	
	//3rd way
	@RequestMapping("/result")
	public ModelAndView index(@RequestParam("val") String data)
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("value", data);
		return mv;
	}
}
