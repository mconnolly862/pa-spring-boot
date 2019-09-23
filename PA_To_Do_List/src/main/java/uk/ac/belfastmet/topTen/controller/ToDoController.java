package uk.ac.belfastmet.topTen.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import uk.ac.belfastmet.topTen.service.ToDoService;

public class ToDoController {
	
Logger logger=LoggerFactory.getLogger(ToDoController.class);
@RequestMapping(value="/", method= RequestMethod.GET)
public String homePage()
{
logger.info("Messsage");


	return "index.html";
}


public String ToDoService(Model model) {
	logger.info("ToDoService is being called");
	ToDoService todoservice = new ToDoService();
	model.addAttribute("todo", todoservice.gettasks());
	logger.info(todoservice.gettasks().toString());
	model.addAttribute("pageTitle", "todo woohooo");
	
	return "/list";
	
}







}
