package com.rimmon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Marcin Niedzielski.
 * since 26.02.2018
 */
@Controller("/")
public class CalendarController {

    @GetMapping("")
    public String calendar() {
        return "calendar";
    }
}
