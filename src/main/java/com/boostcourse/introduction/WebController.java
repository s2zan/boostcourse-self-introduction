package com.boostcourse.introduction;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
@AllArgsConstructor
public class WebController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/aboutme")
    public String aboutme(){
        return "aboutme";
    }

    @RequestMapping("/photo")
    public String photo(){
        return "photo";
    }

    @RequestMapping("/aboutme/today")
    public @ResponseBody String today(){
        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("현재시간 : yyyy/MM/dd H:m"));
        return "<a href='/'>메인화면</a><br> <div style='position: absolute; top: 50%; left: 50%; margin-left: -50px;'>"+date+"</div>";
    }
}
