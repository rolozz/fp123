package org.kosareva.controllers;

import org.kosareva.model.Example;
import org.kosareva.services.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/example")
public class ExController {

    private final ExampleService exampleService;

    @Autowired
    public ExController(ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GetMapping("/all")
    public String getAllExamples(Model model) {
        List<Example> examples = exampleService.getAll();
        model.addAttribute("examples", examples);
        return "index";
    }
}
