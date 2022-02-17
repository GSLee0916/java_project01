package pack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pack.model.BoardDao;

@Controller
public class WriteController {
	
	@Autowired
	private BoardDao dao;
	
	@RequestMapping(value = "write", method=RequestMethod.GET)  //get 방식으로 입력화면을 만나고
	public String write() {
		return "insform";
	}
	
	@RequestMapping(value = "write", method=RequestMethod.POST)  //post 방식으로 입력된 결과를 받는 것
	public String submit(BoardBean bean) {
		boolean b = dao.writeData(bean);
		
		if(b)
			return "redirect:/list";  //글추가 후 목록
		else
			return "redirect:/error";  // error 처리
	}
	
}
