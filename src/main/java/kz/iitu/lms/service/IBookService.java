package kz.iitu.lms.service;

import kz.iitu.lms.model.Book;

import java.awt.*;

public interface IBookService {
    Book create();
    Book update(Book o);
    void delete(Long o);
    Book getById(Long id);
    List<Book> getAll();
    List<Book> getAllByName(String name);
    List<Book> getAllByDesc(String desc);
    List<Book> getAllByAuthor(Long user);
}
