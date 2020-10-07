package com.sri.bootexe.springbootexe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sri.bootexe.springbootexe.Service.Springbootservice;

@Controller
public class Springbootcontroller {
	@Autowired
	private Springbootservice springbootservice;
	
	@RequestMapping("signin")
	public String tosave(SpringbootDto dtocontroller,ModelMap map) {
		try {
			System.out.println("invoked awardee save method in  controller");
			System.out.println(dtocontroller);
			
			
			
			ModelMap decomissinesmess=map.addAttribute("from", "message is from "+dtocontroller.getDecomissines());
			ModelMap accessablemess =map.addAttribute("messageis", "message is  "+dtocontroller.getAccessible());
			ModelMap devdatemess =map.addAttribute("messageis", "message is  "+dtocontroller.getDevelopeddate());
			ModelMap envdetailmess =map.addAttribute("messageis", "message is  "+dtocontroller.getEnvdetail());
			ModelMap lastreleasemess =map.addAttribute("messageis", "message is  "+dtocontroller.getLastreleased());
			ModelMap nextreleasemess =map.addAttribute("messageis", "message is  "+dtocontroller.getNextreleased());
			ModelMap projectnamemess =map.addAttribute("messageis", "message is  "+dtocontroller.getProjectname());
			ModelMap teammailmess =map.addAttribute("messageis", "message is  "+dtocontroller.getTeamcontactmail());
			ModelMap tmnamemess =map.addAttribute("messageis", "message is  "+dtocontroller.getTmname());
			ModelMap urlmess =map.addAttribute("messageis", "message is  "+dtocontroller.getUrl());
			ModelMap versionmess =map.addAttribute("messageis", "message is  "+dtocontroller.getVersion());
			System.out.println("from"+decomissinesmess);
			System.out.println("message is "+accessablemess);
			System.out.println("saving started");
			
			boolean valid=this.springbootservice.save(dtocontroller);
			if(true) {
				System.out.println(valid);
				System.out.println("saved success");
				return "message.jsp";
			}
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		return "signin.jsp";

}}
