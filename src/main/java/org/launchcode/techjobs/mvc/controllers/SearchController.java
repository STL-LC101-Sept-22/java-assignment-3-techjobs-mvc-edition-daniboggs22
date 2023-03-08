package org.launchcode.techjobs.mvc.controllers;

import org.launchcode.techjobs.mvc.models.Job;
import org.launchcode.techjobs.mvc.models.JobData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

import static org.launchcode.techjobs.mvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
//    @PostMapping("search/results")
//    public String displaySearchResults(Model model, @RequestParam String column, @RequestParam(required = false)
//    String key){
//        ArrayList<Job> jobs;
//        if(column.equals("all")){
//            jobs = JobData.findAll();
//            model.addAttribute("title", "All Jobs");
//
//        }
//        model.addAttribute("jobs", jobs);
//
//        return "search";
//    }


}
