/**
 * Created by SHANE on 2015/09/13.
 */
public class Chicken extends Animal implements Speak{
    public Chicken(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
        speak="I'm Cocky the chicken!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
