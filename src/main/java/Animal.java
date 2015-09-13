/**
 * Created by SHANE on 2015/09/13.
 */
public class Animal implements Speak{
    private int age;
    private String name;
    String speak;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    @Override
    public void speak() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
