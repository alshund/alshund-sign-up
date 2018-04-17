package com.heapix.alshund.controller;

import com.heapix.alshund.dto.UserDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("userDto", new UserDto());
        return "home";
    }

    @PostMapping(value = "/sign-up")
    public String signUp(@ModelAttribute UserDto userDto) {
        System.out.println(userDto.getEmail());
        return "redirect:/home";
    }
}
