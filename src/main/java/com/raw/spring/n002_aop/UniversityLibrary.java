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

    public void getBookByName(Book book){
        System.out.println("We take the book from the UniversityLibrary: " + book.getName());
    }
    public String returnBook(){
        System.out.println("We are returning the book to the university library");
        return "return";
    }
    public void addBook(String s){
        System.out.println("We add the book to the UniversityLibrary");
    }
    public void getArticle(String articleName){
        System.out.println("We take an article from the university library with the title: " + articleName);
    }
    public void getMagazine(){
        System.out.println("We take the magazine from the UniversityLibrary");
    }
    public void addMagazine(){
        System.out.println("We add the magazine to the UniversityLibrary");
    }
    public void returnMagazine(){
        System.out.println("We are returning the magazine to the UniversityLibrary");
    }
}
