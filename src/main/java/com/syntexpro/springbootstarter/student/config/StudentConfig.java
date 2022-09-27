//package com.syntexpro.springbootstarter.student.config;
//
//import com.syntexpro.springbootstarter.student.entity.Student;
//import com.syntexpro.springbootstarter.student.repository.StudentRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.time.LocalDate;
//import java.util.List;
//
//import static java.time.Month.FEBRUARY;
//import static java.time.Month.JANUARY;
//
//@Configuration
//public class StudentConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository) {
//        return args -> {
//            Student mehedi = new Student(
//                    "Mehedi",
//                    "mehediaziz@gmail.com",
//                    LocalDate.of(2000, JANUARY, 5)
//            );
//            Student moinul = new Student(
//                    "Moinul",
//                    "moinul@gmail.com",
//                    LocalDate.of(2001, FEBRUARY, 5)
//            );
//            Student tapan = new Student(
//                    "Tapan",
//                    "tapan@gmail.com",
//                    LocalDate.of(2005, FEBRUARY, 5)
//            );
//            Student obayed = new Student(
//                    "Obayeds",
//                    "obayes@gmail.com",
//                    LocalDate.of(2005, FEBRUARY, 5)
//            );
//
//            repository.saveAll(
//                    List.of(mehedi, moinul, tapan, obayed)
//            );
//        };
//    }
//}
//
