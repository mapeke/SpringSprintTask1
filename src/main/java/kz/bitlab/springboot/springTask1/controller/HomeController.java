package kz.bitlab.springboot.springTask1.controller;

import kz.bitlab.springboot.springTask1.db.DBManager;
import kz.bitlab.springboot.springTask1.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String homePage(Model model){
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("students", students);
        return "home";
    }

    @PostMapping(value ="/add-student")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }

    @GetMapping(value = "/add-student")
    public String addStudent(Model model){
        return "addstudent";
    }

}
