package praticeLLDQuestions.Library;

public class IssueBook {

    public boolean processIssue(Members member, Book book) {
        if (member.canBorrowBook() && book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("LOG: Book " + book.getId());
            return true;
        }
        System.out.println("LOG: Issue failed for Book ID: " + book.getId());
        return false;
    }

    public void processReturnBook(Book book){
      book.isAvailable=true;
        System.out.println("The book: "+book.getId()+" is returned");
    }
}
