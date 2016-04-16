package com.springapp.mvc.Controller;

import com.springapp.mvc.Service.DataService;
import com.springapp.mvc.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by ovidiu on 3/11/2016.
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

//    @RequestMapping(method= RequestMethod.GET,value="/getData")
//    @ResponseBody
//    public String verifiyUser(@RequestParam(value = "param1") String param1,@RequestParam(value = "param2") String param2){
//
//    }
@RequestMapping(method=RequestMethod.POST,value="/login")
@ResponseBody
public String login(@RequestParam(value = "param1") String param1,@RequestParam(value = "param2") String param2,HttpServletRequest request)  throws IOException {
    String x = "";
    Boolean exista = userService.userExist(param1,param2);

//        ObjectMapper objectMapper = new ObjectMapper();
//        EntityDataService  entityDataService = new EntityDataService();
//        String result = objectMapper.writeValueAsString(entityDataService.getAllData());
//        return result;
    return exista.toString();

}
}
