public class Person {

    String name;
    int age;
    //Sex sex;

    public Person(String name, int age) { // Sex sex
        this.name = name;
        this.age = age;
        //this.sex = sex;
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

}
