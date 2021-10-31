package com.example.lesson1.Read;

import com.example.lesson1.BeanData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/Profile")
public class ReadController {

    @GetMapping("/Read")
    public String ReadController(){

        BeanData beanData = new BeanData();
        return beanData.EditData(beanData.ReadData());
    }
}
