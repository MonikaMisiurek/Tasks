package task5;

public class Student extends Person{
    private String typeOfStudy;
    private int yearOfStudy;
    private double costOfStudies;

    public Student(String name, String address, String typeOfStudy, int yearOfStudy, double costOfStudies) {
        super(name, address);
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.costOfStudies = costOfStudies;
    }

    public Student(String typeOfStudy, int yearOfStudy, double costOfStudies) {
        super();
        this.typeOfStudy = typeOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.costOfStudies = costOfStudies;
    }

    public String getTypeOfStudy() {
        return typeOfStudy;
    }

    public void setTypeOfStudy(String typeOfStudy) {
        this.typeOfStudy = typeOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public double getCostOfStudies() {
        return costOfStudies;
    }

    public void setCostOfStudies(double costOfStudies) {
        this.costOfStudies = costOfStudies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", typeOfStudy='" + typeOfStudy + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", costOfStudies=" + costOfStudies +
                '}';
    }
}
