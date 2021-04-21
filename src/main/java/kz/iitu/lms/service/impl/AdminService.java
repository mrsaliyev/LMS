package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.Admin;
import kz.iitu.lms.repository.AdminRepository;
import kz.iitu.lms.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
public class AdminService implements IAdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Override
    public List<Admin> getAll() {
        return adminRepository.getAdminBy();
    }

    @Override
    public boolean checkByUsernameAndPassword(String username, String password) {
        return adminRepository.existsAdminByUsernameAndPassword(username, password);
    }
}
