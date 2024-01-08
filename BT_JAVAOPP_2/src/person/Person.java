

package person;

public class Person {
    private String name;
    private int age;
    private String gender;
     private String address;
    private int phone;

    public Person(String name, int age, String gender, String address, int phone) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }

    protected int getAge() { // Phạm vi mặc định (default)
        return age;
    }

    protected int getPhone() {
        return phone;
    }

   public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void getInfo() {
        System.out.println("Ho ten:" + getName());
        System.out.println("Tuoi:" + getAge());
        System.out.println("SDT:" + getPhone());
        System.out.println("Dia chi:" + getAddress());
        System.out.println("Gioi tinh:" + getGender());
    }
}