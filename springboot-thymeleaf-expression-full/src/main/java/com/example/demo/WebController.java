package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {
    @GetMapping("/profile")
    public String profile(Model model) {
        List<Info> profile = new ArrayList<>();
        profile.add(new Info("fullname", "Hoàng Đức Duy"));
        profile.add(new Info("nickname", "Nguyễn Huyền Trang"));

        model.addAttribute("profile", profile);
        return "profile";
    }
}
