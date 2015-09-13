import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestPrinciples {
    Animal a1;
    Animal a2;

    @Test
    public void testFarm() throws Exception {
        a1=new Chicken(12,"John");
        a2=new Cow(4,"Julius");
        a1.speak();
        a2.speak();

        Assert.assertTrue(a1.getSpeak()=="I'm Cocky the chicken!");
        Assert.assertTrue(a2.getSpeak()=="Hey there. I'm a cow!");

    }
}
