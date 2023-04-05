package cogent.infotech.com;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person() {
    }
// constructor based dependency
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    setter based dependency

//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

}
