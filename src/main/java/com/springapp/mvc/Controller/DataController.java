package com.springapp.mvc.Controller;

import com.springapp.mvc.Entity.Data;
import com.springapp.mvc.Service.DataService;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by ovidiu on 3/24/2016.
 */
@Controller
public class DataController {

    @Autowired
    DataService dataService;


    @RequestMapping(method = RequestMethod.GET,value="/getMeteo")
    @ResponseBody
    public String getData(Model map){
        ObjectMapper objectMapper = new ObjectMapper();

        String result = null;
        try {
            result = objectMapper.writeValueAsString(dataService.getData());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //List<Data> dataList = dataService.getData();
        return result;

    }
}
