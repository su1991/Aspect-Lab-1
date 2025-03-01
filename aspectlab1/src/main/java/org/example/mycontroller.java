package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class mycontroller {
    public static void main(String[] args) {
        SpringApplication.run(mycontroller.class, args);
    }
}

@Aspect
@Configuration
class NewLoggingAspect {
    @Before("execution(* org.example.*Controller.*(..))")
    public void logBefore() {
        System.out.println("[LOG] Controller method execution started.");
    }
}

@RequestMapping("/service")
@RestController
class GetController {
    @GetMapping("/LABtitle")
    public String labTitle() {
        return "LAB1";
    }

    @GetMapping("/ID")
    public String labId() {
        return "19p6517.";
    }
}

@RequestMapping("/service")
@RestController
class PostController {
    @PostMapping("/CourseName")
    public String courseName() {
        return "Aspect";
    }
}

@RequestMapping("/service")
@RestController
class PutController {
    @PutMapping("/CourseMarks")
    public String courseMarks() {
        return "A+";
    }
}

@RequestMapping("/service")
@RestController
class DeleteController {
    @DeleteMapping("/CourseDescription")
    public String courseDescription() {
        return "Focuses on Aspect programming";
    }
}
