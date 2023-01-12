public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age< this.age) {
            throw new IllegalArgumentException("Возвраст не может быть отрицательным");
        }
        if (age > 0) {
            throw new IllegalArgumentException("Возвраст отрицательный");
        }
        this.age = age;
    }

    public boolean isAdult() {
        return this.getAge() > 18;
    }
    public String toString() {
        return "Имя " + getName() + " Возвраст " + getAge();
    }

}
