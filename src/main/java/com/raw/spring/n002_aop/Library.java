package com.raw.spring.n002_aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(){
        // опустим детали:
        /// кто, где, какую книгу взял, когда, имел право, теперь эту книгу никто не может взять и тд
        System.out.println("We take the book");
    }
}
