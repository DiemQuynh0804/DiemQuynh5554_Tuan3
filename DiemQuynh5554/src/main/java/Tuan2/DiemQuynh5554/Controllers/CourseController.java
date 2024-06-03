package Tuan2.DiemQuynh5554.Controllers;

import Tuan2.DiemQuynh5554.Models.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CourseController {

    @GetMapping("/courses")
    public String listCourses(Model model) {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("IT001", "Lập trình Java", "LapTrinhJava.jpg"));
        courses.add(new Course("IT002", "Lập trình hướng đối tượng", "LapTrinhHuongDoiTuong.jpg"));
        courses.add(new Course("IT003", "Cơ sở dữ liệu", "CoSoDuLieu.jpg"));
        courses.add(new Course("IT004", "Trí tuệ nhân tạo", "TriTueNhanTao.jpg"));

        model.addAttribute("courses", courses);
        return "courses/courses";
    }
}