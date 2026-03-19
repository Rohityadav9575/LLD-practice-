package praticeLLDQuestions.Library;

public class Student implements Members{
    int id;
    String name;

    public Student(int id,String name) {
        this.id = id;
        this.name=name;
    }

    public void setId(int id) {
        this.id = id;
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
        return true;
    }
}
