package kz.iitu.lms.service;

import kz.iitu.lms.model.UserBooks;

import java.awt.*;

public interface IUserBooksService {
    UserBooks create(UserBooks o);
    UserBooks update(UserBooks o);
    void delete(UserBooks o);
    UserBooks getById(Long id);
    List<UserBooks> getAll();
    List<UserBooks> getAllByUser(Long userId);
    List<UserBooks> getAllByBook(Long bookId);
}
