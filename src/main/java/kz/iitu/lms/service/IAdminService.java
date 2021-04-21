package kz.iitu.lms.service;

import kz.iitu.lms.model.Admin;

import java.awt.*;

public interface IAdminService {
    List<Admin> getAll();
    boolean checkByUsernameAndPassword(String username, String password);
}
