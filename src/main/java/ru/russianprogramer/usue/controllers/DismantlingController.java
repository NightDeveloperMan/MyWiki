package ru.russianprogramer.usue.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.russianprogramer.usue.models.dissassemly.models.DismantlingDataAccessObject;

import java.sql.SQLException;


@Controller
@RequestMapping("/diss")
public class DismantlingController {

    private DismantlingDataAccessObject data = new DismantlingDataAccessObject();

    public DismantlingController() throws SQLException {
    }

    @GetMapping()
    public String showComplects(Model model) {

        model.addAttribute("data", data);
        return "disassemly/dismantling";
    }

    @PostMapping("/addKit")
    public String addKit()
    {
        data.addEmptyKit();
        return "redirect:/diss";
    }

    @PostMapping("/saveKit")
    public String saveKit()
    {
        data.saveKit();
        return "redirect:/diss";
    }

//    @GetMapping("/{id}")
//
//    public String showComplects(@PathVariable("id") int id, DocumentEditor documentEditor,Model model) {
//
//        return "disassemly/dismantling";
//    }
}
