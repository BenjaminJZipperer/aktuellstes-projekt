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
public class DemoController
{
    @Autowired
    JdbcActorRepository repository;
    
    @Autowired
    JdbcSpeakerRepository repositoryVan;

    // Enable a simple endppoint for the start page at port 8080 on localhost
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String indexBar(Model mm)
    {

        return "index";
    }
    // Redirction to the endpoint stuffed with speakers 
    @RequestMapping(value="/protagonists", method = RequestMethod.GET)
    public String indexFoo(Model mm)
    {
        List <Actor> spieler =  (List<Actor>)repository.findAll();
        mm.addAttribute("players",spieler);
        return "protaliste";
    }
    // Redirction to the endpoint stuffed with speakers 
    @RequestMapping(value="/speakerlist", method = RequestMethod.GET)
    public String indexYaarn(Model mm)
    {
        List <Speaker> sprecher =  (List<Speaker>)repositoryVan.findAll();
        mm.addAttribute("speakers",sprecher);
        return "sprecherliste";
    }
    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public String deleteActor(@PathVariable("id") Long aid, Model mu)
    {// Geheimnis Eckstein
        System.out.println("Loesche "+aid);
        int outcome = repository.deleteActor(aid);
        if(outcome == -1)
            return "unloeschbar.html";
       
    return "redirect:/";
    }

    @RequestMapping(value="/deleteSpeaker/{id}", method = RequestMethod.GET)
    public String deleteSpeaker(@PathVariable("id") Long aid, Model mu)
    {// Geheimnis Eckstein
        System.out.println("Loesche "+aid);
        int outcome = repositoryVan.deleteSpeaker(aid);
        if(outcome == -1)
            return "unloeschbar.html";
       
    return "redirect:/";
    }
}