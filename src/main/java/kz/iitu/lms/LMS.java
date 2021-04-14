package kz.iitu.lms;

import jdk.nashorn.internal.runtime.regexp.joni.Config;
import kz.iitu.lms.service.impl.BookService;
import kz.iitu.lms.service.impl.UserBooksService;
import kz.iitu.lms.service.impl.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class LMS {
    public void menuShow() throws SQLException {
        Scanner in = new Scanner(System.in);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        BookService bookService = context.getBean(BookService.class);
        UserService userService = context.getBean(UserService.class);
        UserBooksService userBooksService = context.getBean(UserBooksService.class);

        int choice = -1;

        while (choice != 0) {
            System.out.println("1. Add user");
            System.out.println("2. Add Book");
            System.out.println("3. Search by Name");
            System.out.println("4. Search by Author");
            System.out.println("5. List of Authors");
            System.out.println("6. List of books");
            System.out.println("0. Exit");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    userService.create();
                    break;
                case 2:
                    bookService.create();
                    break;
                case 3:
                    userBooksService.getAllByBook();
                    break;
                case 4:
                    userBooksService.getAllByUser();
                    break;
                case 5:
                    userService.getAll();
                    break;
                case 6:
                    bookService.getAll();
                    break;
                case 0:
                    return;
            }
        }
    }
}
