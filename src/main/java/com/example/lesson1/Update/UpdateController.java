package com.example.lesson1.Update;

import com.example.lesson1.BeanData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import java.io.File;

@RestController
@RequestMapping(value = "/Profile")
public class UpdateController {

    @GetMapping("/Update")
    public RedirectView UpdateController(){

        BeanData beanData = new BeanData();
        beanData.Login = beanData.setLogin();
        beanData.PIN = beanData.setPIN();
        File file = new File("D://", "Profile.txt");

        beanData.WriteData(file,beanData.Login + "\r\n" + beanData.PIN);

        return new RedirectView("localhost:8080/Profile/Read");
    }
}
