public class StudentOop {

    protected String name,email;

    public StudentOop(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void print(){
        System.out.println(this.name);
        System.out.println(this.email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Teacher extends StudentOop{

    protected String subjects;
    public Teacher(String name, String email,String subjects) {
        super(name, email);
        this.subjects = subjects;
    }

    @Override
    public void print(){
        super.print();
        System.out.println(this.subjects);
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}

class TestStudent1{
    public static void main(String[] args) {
        Teacher t = new Teacher("Ravi","ravi@gmail.com","Java,SQL");
        t.print();
        System.out.println(t.getSubjects());
    }
}
