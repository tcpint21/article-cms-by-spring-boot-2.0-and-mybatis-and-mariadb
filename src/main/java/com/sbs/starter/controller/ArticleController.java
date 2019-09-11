package com.sbs.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.starter.dto.Article;
import com.sbs.starter.service.ArticleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ArticleController {
	@Autowired
	ArticleService articleService;

	@RequestMapping("/article/list")
	public String showMain(Model aModel) {
		List<Article> list = articleService.getList();

		aModel.addAttribute("list", list);

		return "article/list";
	}
	
	@RequestMapping("/article/add")
	public String showAdd() {
		return "article/add";
	}	
}
