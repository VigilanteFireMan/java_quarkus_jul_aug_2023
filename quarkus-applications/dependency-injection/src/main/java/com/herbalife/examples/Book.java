package com.herbalife.examples;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Scope;
import jakarta.inject.Singleton;

//@Singleton
//@RequestScoped
//@SessionScoped
@ApplicationScoped
public class Book {

    Publisher publisher;
    String title;


    public Book(Publisher publisher/*, String title*/) {
        System.out.println("Book created " + this);
        this.publisher = publisher;
        //this.title = title;
    }
}

@Singleton
class Publisher {

}
