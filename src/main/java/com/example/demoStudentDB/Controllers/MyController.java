package com.example.demoStudentDB.Controllers;

import com.example.demoStudentDB.Models.Student;
import com.example.demoStudentDB.Models.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class MyController {
    @Autowired
    StudentRepo sRepo;

    @RequestMapping("/")
    public String home(){
        return "index";
    }

    @RequestMapping("/view")
    public ModelAndView view(){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("students", sRepo.findAll());
        return mv;
    }

    @RequestMapping("/view2")
    public ModelAndView view2(){
        ModelAndView mv = new ModelAndView("view2");
        mv.addObject("students", sRepo.findAll());
        return mv; }

    @RequestMapping(value="/edit/{id}", method= RequestMethod.GET)
    public ModelAndView edit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        Student sToEdit;
        Optional<Student> s = sRepo.findById(id);
        sToEdit = s.get();
        mv.addObject("selectedStudent", sToEdit);
        return mv;
    }

    @RequestMapping(value="save", method=RequestMethod.POST)
    public ModelAndView save(@RequestParam("id") int id,
    @RequestParam("fname") String fname, @RequestParam("lname") String lname) {
        ModelAndView mv = new ModelAndView("redirect:/view");
        Student sToSave;
        Optional<Student> s = sRepo.findById(id);
        if (s.isPresent()) {
            sToSave = s.get();
        } else {
            sToSave = new Student();
            sToSave.setId(id);
        }
        sToSave.setFname(fname);
        sToSave.setLname(lname);
        sRepo.save(sToSave);
        mv.addObject("students", sRepo.findAll());
        return mv;
    }

    @RequestMapping(value="/add", method=RequestMethod.GET)
    String add(){
    ModelAndView mv = new ModelAndView("add");
    return "add"; }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    public ModelAndView delete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/view");
        sRepo.deleteById(id);
        mv.addObject("students", sRepo.findAll());
        return mv;  }

    @RequestMapping(value="/findUsingFname", method=RequestMethod.GET)
            public String findUsingFname(){
            ModelAndView mv= new ModelAndView("findUsingFname");
            return "findUsingFname";
            }

    @RequestMapping(value="findByFN", method=RequestMethod.POST)
    public ModelAndView findByFN(@RequestParam("fname")
    String fname){
        ModelAndView mv= new ModelAndView("viewbyname");
        mv.addObject("lstudents", sRepo.findByFname(fname));
        return mv;
    }


}

