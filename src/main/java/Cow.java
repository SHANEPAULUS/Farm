/**
 * Created by SHANE on 2015/09/13.
 */
public class Cow extends Animal implements Speak{

    public Cow(int age, String name) {
        super(age, name);
    }

    @Override
    public void speak() {
       speak="Hey there. I'm a cow!";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
