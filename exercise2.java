package homeWorks;


public class exercise2 {
public static void main(String[] args) {
        Person student = new Student("Smith", "Estonia, Tallinn ");
        Person staff = new Staff ("Cloud engineer", "Sweden, Stockholm", 5000f);
        System.out.println(student);
        System.out.println(staff);
    }
}
class Person {
    protected String name, address, typeOfStudies, yearOfStudy, studyPrice;
    public Person(String name, String address){
    }



    public Person(String name, String address, String typeOfStudies, int yearOfStudy, double studyPrice){
        this.name = name;
        this.address = address;
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudy = String.valueOf(yearOfStudy);
        this.studyPrice = String.valueOf(studyPrice);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getTypeOfStudies() {
        return typeOfStudies;
    }
    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public float getYearOfStudy() {
        return Float.parseFloat(yearOfStudy);
    }
    public void setYearOfStudy(String yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getStudyPrice() {
        return studyPrice;
    }
    public void setStudyPrice(String studyPrice) {
        this.studyPrice = studyPrice;
    }

    @Override
    public String toString(){
        return String.format("%s->%s", name, address, typeOfStudies, yearOfStudy, studyPrice);
    }
}

class Student extends Person {
    private String typeOfStudies;
    private int yearOfStudy;
    private float studiesPrice;

    public Student(String name, String address){
        super(name, address);
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudy = yearOfStudy;
        this.studiesPrice = studiesPrice;
    }
    public String getTypeOfStudies(){
        return typeOfStudies;
    }
    public void setTypeOfStudies(String typeOfStudies){
        this.typeOfStudies = typeOfStudies;
    }
    public float getYearOfStudy(){
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
    public float getStudiesPrice(){
        return studiesPrice;
    }
    public void setStudiesPrice(float studiesPrice){
        this.studiesPrice = studiesPrice;
    }
    @Override
    public String toString(){
        return "Student{" +
                "name=" + name + "," +
                " address=" + address + ", " +
                "typeOfStudies=" + typeOfStudies + ", " +
                "yearOfStudy=" + yearOfStudy + ", " +
                "studiesPrice=" + studiesPrice + '}';
    }
}
 class Staff extends Person {
     private String specialization;
     private float salary;

     public Staff(String name, String address, float v) {
         super(name, address);
         this.specialization = specialization;
         this.salary = salary;
     }

     public String getSpecialization() {
         return specialization;
     }

     public void setSpecialization(String specialization) {
         this.specialization = specialization;
     }

     public float getSalary() {
         return salary;
     }

     public void setSalary(float salary) {
         this.salary = salary;
     }

     @Override
     public String toString() {
         return "Staff{" +
                 "name=" + name + "," +
                 " address=" + address + ", " +
                 "specialization=" + specialization + ", " +
                 "salary=" + salary + '}';
     }
 }
