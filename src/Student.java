public class Student {
    
    private int id;
    private String name;
    private String email;
    private String phone;
    private String section;
    private double cgpa;
    
    // Constructor
    public Student(String name, String email, 
                   String phone, String section, double cgpa) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.section = section;
        this.cgpa = cgpa;
    }
    
    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getSection() { return section; }
    public double getCgpa() { return cgpa; }
    
    // Setter
    public void setId(int id) { this.id = id; }
}