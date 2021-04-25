package kz.iitu.lms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.awt.*;
import java.util.Collection;

import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id",insertable = false,updatable = false)
    @JsonIgnore
    private User author;
    @Column(name = "author_id")
    private Long authorId;

    public Book () {}

    public Book(String name, String description) {
        this.name = name;
        this.description = description;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public User getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(User author) {
//        this.author = author;
//    }
//
//    public Long getAuthorId() {
//        return authorId;
//    }
//
//    public void setAuthorId(Long authorId) {
//        this.authorId = authorId;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author=" + author +
                ", authorId=" + authorId +
                '}';
    }
}
