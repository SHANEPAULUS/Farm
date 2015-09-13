import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestAlternativeToInheritance {
    Truck t1;
    Truck t2;
    Composite c1;

    @Test
    public void testComposite() throws Exception {
        t1=new Truck("Volvo");
        t2=new Truck("Scania");

        c1=new Composite();
        c1.add(t1);
        c1.add(t2);

        t1.drive();
        //c1.drive();
        Assert.assertTrue("Volvo Truck is driving"==t1.getDriveStat());

    }
}
