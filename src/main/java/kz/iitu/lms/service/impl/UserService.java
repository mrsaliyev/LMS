package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.model.User;
import kz.iitu.lms.repository.UserRepository;
import kz.iitu.lms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Date;
import java.util.Scanner;

@Service
public class UserService implements IUserService {
    Scanner in = new Scanner(System.in);

    @Autowired
    private UserRepository userRepo;

    @Override
    public User create() {
        System.out.print("Enter Full name: ");
        String name = in.next();
        System.out.print("Enter date: ");
        String date = in.next();

        User user = new User(name, date);
        return userRepo.save(user);
    }

    @Override
    public User update(User o) {
        return userRepo.save(o);
    }

    @Override
    public void delete(Long o) {
        userRepo.delete(getById(o));
    }

    @Override
    public User getById(Long id) {
        return userRepo.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public List<User> getAllByName(String name) {
        return userRepo.getAllByFullNameContaining(name);
    }

}
