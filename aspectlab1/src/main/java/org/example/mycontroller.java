package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class
mycontroller
{


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

        @GetMapping("/name")
        public String name() {
            return "Abdelrahman Aboel Nasr";
        }

        @GetMapping("/level")
        public String level() {
            return "Senior 2";
        }

        @GetMapping("/GPA")
        public String gpa() {
            return "Good";
        }
    }

    @RequestMapping("/service")
    @RestController
    class PostController {
        @PostMapping("/CourseName")
        public String courseName() {
            return "Aspect";
        }

        @PostMapping("/Instructor")
        public String instructor() {
            return "Dr. Wafaa";
        }

        @PostMapping("/Semester")
        public String semester() {
            return "Spring 2025";
        }

        @PostMapping("/Credits")
        public String credits() {
            return "3";
        }

        @PostMapping("/Location")
        public String location() {
            return "Building credit";
        }
    }

    @RequestMapping("/service")
    @RestController
    class PutController {
        @PutMapping("/CourseMarks")
        public String courseMarks() {
            return "A+";
        }

        @PutMapping("/Attendance")
        public String attendance() {
            return "100%";
        }

        @PutMapping("/Projects")
        public String projects() {
            return " in progress";
        }

        @PutMapping("/Exams")
        public String exams() {
            return "Midterm and Final and quizzes";
        }

        @PutMapping("/Participation")
        public String participation() {
            return "Active";
        }
    }

    @RequestMapping("/service")
    @RestController
    class DeleteController {
        @DeleteMapping("/CourseDescription")
        public String courseDescription() {
            return "Focuses on Aspect programming";
        }

        @DeleteMapping("/OldAssignments")
        public String oldAssignments() {
            return "marked";
        }

        @DeleteMapping("/CancelledClasses")
        public String cancelledClasses() {
            return "there is No cancelled classes";
        }

        @DeleteMapping("/ObsoleteMaterials")
        public String obsoleteMaterials() {
            return "renewed";
        }

        @DeleteMapping("/quizzes")
        public String quizzes() {
            return "not held yet";
        }
    }
}