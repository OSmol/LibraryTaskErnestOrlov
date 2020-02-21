package by.javatr.orlov.dao.impl.FileBookDAO;

import by.javatr.orlov.bean.Book;

public class EditBookISBN implements BookEditor {

    @Override
    public void editBook (Book book, String newValue){
        book.setISBN(newValue);
    }
}