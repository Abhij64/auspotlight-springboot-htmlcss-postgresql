package com.example.test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.security.Principal;
@Controller

public class IndexController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventRepository eventRepository;
    @GetMapping("/")
    public String home(Model model, Principal principal) {
        List<Event> events = eventRepository.findAll();
        model.addAttribute("events", events);

        if (principal != null) {
            String loggedInUsername = principal.getName(); // Get the logged-in username
            User loggedInUser = userRepository.findByUsername(loggedInUsername); // Find the user by username

            if (loggedInUser != null) {
                model.addAttribute("loggedInUser", loggedInUser); // Add the logged-in user to the model
            }
        }

        return "index";
    }

    @GetMapping("/register")
    public String register(Model model){
        model.addAttribute("user",new User());
        return "loginpage";
    }
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {
        // Save the user to the database
        userRepository.save(user);
        // Redirect to the login page after successful registration
        return "redirect:/";
    }
    @GetMapping("/login")
    public String LoginForm(){
        return "loginpage";
    }
    @PostMapping("/login")
    public String loginUser(@RequestParam String username,@RequestParam String password1,Model model){
        User user = userRepository.findByUsernameAndPassword1(username,password1);
        if (user!=null){
            model.addAttribute("user",user);
            return "redirect:/";
        }
        else{
            model.addAttribute("error","Incorrect Username or Password");
            return "loginpage";
        }
    }
    @GetMapping("/hostevent")
    public String hostanEvent(Model model){
        model.addAttribute("event",new Event());
        return "hostevent";
    }
    @PostMapping("/hostevent")
    public String EventHosted(@ModelAttribute Event event){
        eventRepository.save(event);
        return "redirect:/";
    }
    @GetMapping("/dashboard")
    public String Dashboard(){
        return "dashboard";
    }
}
