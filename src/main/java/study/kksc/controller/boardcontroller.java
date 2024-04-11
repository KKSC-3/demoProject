package study.kksc.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController("/board")
public class boardcontroller {
    @GetMapping("/")
    public String createPost(@RequestParam String param) {
        return null;
    }
}