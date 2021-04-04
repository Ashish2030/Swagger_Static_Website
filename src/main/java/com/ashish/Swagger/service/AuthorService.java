package com.ashish.Swagger.service;

import com.ashish.Swagger.model.Author;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class AuthorService
{
    public static ArrayList<Author> Author=new ArrayList<>();
    static
    {
        Author author1=new Author();
        author1.setAuthorId(1L);
        author1.setAuthorname("Ashish");

        Author author2=new Author();
        author2.setAuthorId(2L);
        author2.setAuthorname("Abhishek");

        Author author3=new Author();
        author3.setAuthorId(3L);
        author3.setAuthorname("Anshu");

        Author.add(author1);
        Author.add(author2);
        Author.add(author3);
    }
    public ArrayList<Author> getAllAuthor()
    {
        return Author;
    }
    public Author addAuthor(Author author) {
        Author.add(author);
        return author;
    }
}
