package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorTestController {
	@RequestMapping("/error")
	@ResponseBody
    public String error()
    {
        System.out.println("get value");
        return "error page";
    }
	
	@RequestMapping("/test/interceptor")
    @ResponseBody
    public String perform()
    {

        System.out.println("get value");
        return "Get value";
    }
}
