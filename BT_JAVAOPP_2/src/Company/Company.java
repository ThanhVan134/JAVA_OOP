package Company;

import person.Person;

public class Company {
        public static void main(String[] args) {
            Person person = new Person("van",24,"nu","Hanoi",1245);
            System.out.println("Họ và tên: "+ person.getName());
            System.out.println("Địa chỉ: " +person.getAddress());
            System.out.println("Giới tính: " +person.getGender());
        }

    }

