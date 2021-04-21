package kz.iitu.lms.controller;

import kz.iitu.lms.model.Admin;
import kz.iitu.lms.service.impl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/admin")
public class    AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping("")
    public List<Admin> getAllAdmin() {
        return adminService.getAll();
    }
}
