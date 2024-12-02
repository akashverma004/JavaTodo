package com.akash.springboot.todowebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	// "say-hello" => "what you are learning today?"
	@RequestMapping("say-hello")
	@ResponseBody
	public String Hello() {
		return "<h1>What you are learning today?</h1>";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String HelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<h1 style='color:red;'>What you are learning today?</h1>");
		return sb.toString();
	}
	
	// src/main/resource/META-INF/resources/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("say-hello-jsp")
	public String SayHelloJsp() {
		return "sayHello";
	}
}
