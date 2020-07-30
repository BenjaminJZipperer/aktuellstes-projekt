package com.gallier.gallierapplication.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
// https://quarkus.io/guides/hibernate-orm
import java.util.*;
import com.gallier.gallierapplication.modeldomain.*;
@Controller//https://spring.io/guides/gs/serving-web-content/
//https://blogs.perficient.com/2017/04/18/spring-boot-with-thymeleaf/#:~:text=Thymeleaf%20is%20a%20Java%20library,Thymeleaf%20template%20engine%20and%20JPA.
public class AddController
{
    /*
   fff
    */
    @Autowired
    JdbcActorRepository repository;
    
    @Autowired
    JdbcSpeakerRepository repositoryVan;


    @RequestMapping(value="/addNew", method = RequestMethod.GET)
    public String addActor(Model foo) {
        foo.addAttribute("heller",new Actor());
        return "addActor";
    }

    @RequestMapping(value="save",method=RequestMethod.POST)
    public String save(Actor dunkler){
        repository.save(dunkler);
        return "redirect:/";
    }
}