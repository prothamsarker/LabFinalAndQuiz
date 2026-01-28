class Student {
    private int id;
    private String name;
    private double cgpa;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0");
        }
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setId(101);
        s1.setName("Protham");
        s1.setCgpa(3.5);

        s1.setCgpa(4.8);

        System.out.println("Student ID: " + s1.getId());
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student CGPA: " + s1.getCgpa());
    }
}
