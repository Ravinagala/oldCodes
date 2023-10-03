class Student{
    private String name;
    private int age;

    private String course;

    private String location;

    public Student( String name, int age, String course, String location) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Student( int age, String name) {
        this.name = name;
        this.age = age;

    }

}

