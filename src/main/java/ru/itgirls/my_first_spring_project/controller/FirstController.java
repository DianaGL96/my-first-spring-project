package ru.itgirls.my_first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.itgirls.my_first_spring_project.day_of_week.DayOfWeek;

@RestController
public class FirstController {
    @GetMapping("/dayOfWeek")

    public String dayOfWeek(@RequestParam(value = "name")String name) {
        try{
            DayOfWeek dayOfWeek = DayOfWeek.valueOf(name.toUpperCase());
            return String.format("Сегодня %s!", dayOfWeek.getRussianName());
        } catch (IllegalArgumentException e) {
            return "Некорректный день недели. Пожалуйста, введите день недели на английском в формате: MONDAY";
        }
    }
}
