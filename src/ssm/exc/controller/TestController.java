package ssm.exc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ssm.exc.po.Item;
import ssm.exc.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@RequestMapping("/testJsp")
	public ModelAndView testJsp(){
		List<Item> list = null;
		
		try {
			list = testService.findItems(12);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("itemList",list);
		mv.setViewName("test");
		return mv;
	}
}
