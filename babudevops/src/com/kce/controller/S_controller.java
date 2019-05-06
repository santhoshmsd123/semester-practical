package com.kce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class S_controller {
@RequestMapping("/")
public String dothing()
{
	return "new";
}
}
