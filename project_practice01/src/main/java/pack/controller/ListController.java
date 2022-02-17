package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.BoardDao;
import pack.model.BoardDto;

@Controller
public class ListController {
	@Autowired
	private BoardDao dao;
	
	@RequestMapping("list")  
	public ModelAndView list() {
		List<BoardDto> list = dao.list();  // BoardDao에서 넘긴 list를 받음.
		return new ModelAndView("list", "list", list);  //list.jsp로 list라는 키로 list를 넘김.
	}
}
