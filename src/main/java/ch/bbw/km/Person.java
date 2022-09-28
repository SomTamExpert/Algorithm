package ch.bbw.km;

public class Person implements Comparable<Person>{
    private String firstname; // Vorname
    private String lastname; // Nachname
    private double height; // Körpergrösse in cm
    private int shoeSize; // Schuhgrösse EU
    private int age;

    public Person(String firstname, String lastname, double height, int shoeSize, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.height = height;
        this.shoeSize = shoeSize;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    Aufgabe 4.1
//    public int compareTo(Person p1) {
//        if (age > p1.getAge()) {
//            return 1;
//        } else if (age < p1.getAge()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }

// Aufgabe 4.2
    public int compareTo(Person p1) {
        if (lastname.compareTo(p1.getLastname()) > 0) {
            return 1;
        } else if (lastname.compareTo(p1.getLastname()) < 0) {
            return -1;
        } else {
            if (age > p1.getAge()) {
                return 1;
            } else if (age < p1.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
