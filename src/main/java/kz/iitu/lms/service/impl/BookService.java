package kz.iitu.lms.service.impl;

import kz.iitu.lms.model.Book;
import kz.iitu.lms.repository.BookRepository;
import kz.iitu.lms.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Scanner;

@Service
public class BookService implements IBookService {
    Scanner in = new Scanner(System.in);

    @Autowired
    private BookRepository bookRepo;

    @Override
    public Book create() {
        System.out.print("Enter name: ");
        String name = in.next();
        System.out.print("Enter Description: ");
        String desc = in.next();

        Book book = new Book(name, desc);

        return bookRepo.save(book);
    }

    @Override
    public Book update(Book o) {
        return bookRepo.save(o);
    }

    @Override
    public void delete(Long o) {
        bookRepo.delete(getById(o));
    }

    @Override
    public Book getById(Long id) {
        return bookRepo.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    @Override
    public List<Book> getAllByName(String name) {
        return bookRepo.getByNameContaining(name);
    }

    @Override
    public List<Book> getAllByDesc(String desc) {
        return bookRepo.getAllByInfoContaining(desc);
    }

    @Override
    public List<Book> getAllByAuthor(Long user) {
        return bookRepo.getAllByAuthorId(user);
    }
}
