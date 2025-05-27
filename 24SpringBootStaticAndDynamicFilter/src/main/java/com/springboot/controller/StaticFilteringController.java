package com.springboot.controller;

import com.springboot.bean.StaticFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/static")  // Optional base path
public class StaticFilteringController {

    @GetMapping("/filtering")
    public StaticFilter retrieveSome() {
        return new StaticFilter("value1", "value2", "value3");
    }

    @GetMapping("/filtering-list")
    public List<StaticFilter> retrieveSomeList() {
        return List.of(
            new StaticFilter("value1", "value2", "value3"),
            new StaticFilter("value11", "value22", "value3"),
            new StaticFilter("value21", "value2", "value33"),
            new StaticFilter("value41", "value2", "value3")
        );
    }
}
