package com.springapp.mvc.Controller;

import com.springapp.mvc.Service.EntityDataService;
import com.springapp.mvc.Service.UserService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
        userService.getUser();
		return "hello";
	}

    @RequestMapping(method=RequestMethod.GET,value="/getData")
    @ResponseBody
    public String getData() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        EntityDataService  entityDataService = new EntityDataService();
        String result = objectMapper.writeValueAsString(entityDataService.getAllData());
        return result;

    }


}