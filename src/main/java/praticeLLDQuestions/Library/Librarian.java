package praticeLLDQuestions.Library;

public class Librarian implements Members{
    int id;
    String name;
    public Librarian(int id,String name) {
        this.id = id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean canBorrowBook() {
        return false;
    }
}
