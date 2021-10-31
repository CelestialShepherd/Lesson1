package com.example.lesson1.Delete;

import com.example.lesson1.BeanData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping(value = "/Profile")
public class DeleteController {

    @GetMapping("/Delete")
    public RedirectView DeleteController(){

        BeanData beanData = new BeanData();
        beanData.DeleteData();
        return new RedirectView("localhost:8080/Profile/Create");
    }
}
