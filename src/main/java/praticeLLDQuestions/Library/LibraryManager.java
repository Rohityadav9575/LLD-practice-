package praticeLLDQuestions.Library;

import java.util.List;
import java.util.Optional;

public class LibraryManager {
    private Library library;
    private IssueBook issueBook;

    public LibraryManager(Library library, IssueBook issueBook) {
        this.library = library;
        this.issueBook = issueBook;
    }

    public void issueBook(int id, Members members){
        Optional<Book> bookOptional=library.findBookById(id);
        if(members.canBorrowBook() && bookOptional.isPresent()){
            issueBook.processIssue(members,bookOptional.get());
        }
    }

}
