package praticeLLDQuestions.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {
   private List<Book> bookList=new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    public void remove(Book book){
        bookList.remove(book);
    }
    public Optional<Book> findBookById(int id){
        for(int i=0;i<bookList.size();i++){
            if(bookList.get(i).getId()==id){
                return Optional.ofNullable(bookList.get(i));
            }
        }
        return Optional.empty();
    }
    public List<Book> getAllBooks() {
            return bookList;
    }

}
