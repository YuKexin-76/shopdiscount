public class User {
    private int id;
    private String name;
    private boolean student;

    public User(int id, String name, boolean student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public boolean isStudent() {
        return student;
    }
    public String getName() {
        return name;
    }
}
