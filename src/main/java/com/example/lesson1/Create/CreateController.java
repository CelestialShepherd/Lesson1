package com.example.lesson1.Create;

import com.example.lesson1.BeanData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping(value = "/Profile")
public class CreateController {

    @GetMapping("/Create")
    public RedirectView CreateController(){

        BeanData beanData = new BeanData();
        beanData.Login = beanData.setLogin();
        beanData.PIN = beanData.setPIN();

        beanData.InsertData(beanData);

        return new RedirectView("localhost:8080/Profile/Read");
    }
}
