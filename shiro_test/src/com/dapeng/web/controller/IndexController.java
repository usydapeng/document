package com.dapeng.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class IndexController {

	private static Logger logger = LoggerFactory.getLogger(IndexController.class);

	@RequestMapping("/index")
	public String index(@RequestParam(value = "name", required = false, defaultValue = "张三") String name, Model model){
		model.addAttribute("name", name);
		return "index";
	}
}
