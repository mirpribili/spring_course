package com.raw.spring.n002_aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{
    @Override
    public void getBook() {
        System.out.println("We take the book from the SchoolLibrary");
    }
}
