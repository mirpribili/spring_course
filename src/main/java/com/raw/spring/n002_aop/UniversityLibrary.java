package com.raw.spring.n002_aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        // опустим детали:
        /// кто, где, какую книгу взял, когда, имел право, теперь эту книгу никто не может взять и тд
        System.out.println("We take the book from the UniversityLibrary");
    }
    public String returnBook(){
        System.out.println("We are returning the book to the university library");
        return "return";
    }
    public void getMagazine(){
        System.out.println("We take the magazine from the UniversityLibrary");
    }
}
