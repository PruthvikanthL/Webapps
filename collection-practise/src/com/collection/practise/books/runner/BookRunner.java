package com.collection.practise.books.runner;

import com.collection.practise.books.dto.BookDto;

import java.util.ArrayList;
import java.util.Collection;

public class BookRunner {
    public static void main(String[] args) {
        BookDto bookDto1=new BookDto("The Alchemist", "Paulo Coelho", "Fiction", 208, 350.0);
        BookDto bookDto2=new BookDto("1984", "George Orwell", "Dystopian", 328, 299.0);
        BookDto bookDto3=new BookDto("To Kill a Mockingbird", "Harper Lee", "Classic", 281, 399.0);
        BookDto bookDto4=new BookDto("The Hobbit", "J.R.R. Tolkien", "Fantasy", 310, 450.0);
        BookDto bookDto5=new BookDto("Sapiens", "Yuval Noah Harari", "Non-fiction", 498, 550.0);
        BookDto bookDto6=new BookDto("The Power of Habit", "Charles Duhigg", "Self-help", 371, 420.0);
        BookDto bookDto7=new BookDto("Think and Grow Rich", "Napoleon Hill", "Motivational", 238, 280.0);
        BookDto bookDto8=new BookDto("Atomic Habits", "James Clear", "Self-help", 320, 500.0);
        BookDto bookDto9=new BookDto("Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", 180, 250.0);
        BookDto bookDto10=new BookDto("The Subtle Art of Not Giving a F*ck", "Mark Manson", "Self-help", 224, 399.0);

        Collection<BookDto> collection=new ArrayList<>();
        collection.add(bookDto1);
        collection.add(bookDto2);
        collection.add(bookDto3);
        collection.add(bookDto4);
        collection.add(bookDto5);
        collection.add(bookDto6);
        collection.add(bookDto7);
        collection.add(bookDto8);
        collection.add(bookDto9);
        collection.add(bookDto10);

        for(BookDto bookDto:collection){
            System.out.println(bookDto.getTitle()+" "+bookDto.getAuthor()+" "+bookDto.getGenre()+" "+bookDto.getPage()+" "+bookDto.getPrice());
        }





    }
}
