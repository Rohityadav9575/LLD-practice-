package praticeLLDQuestions.Library;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        IssueBook issueBookService=new IssueBook();
        LibraryManager libraryManager=new LibraryManager(library,issueBookService);

        // 3. Data Seed (Adding Books)
        library.addBook(new Book(1, "Java Design Patterns", "Gamma"));
        library.addBook(new Book(2, "Clean Code", "Robert Martin"));
        library.addBook(new Book(3, "Effective Java", "Joshua Bloch"));


        // 4. Create Members
        Members student = new Student(1, "Rohit");
        Members librarian = new Librarian(2, "Admin_Amit");

        // 5. Test Business Logic
        System.out.println("\n--- Attempting to Issue Book ---");

        libraryManager.issueBook(1,student);
        libraryManager.issueBook(1,student);
        libraryManager.issueBook(2,librarian);



    }
}
