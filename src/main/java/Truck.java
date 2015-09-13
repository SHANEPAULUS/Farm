/**
 * Created by SHANE on 2015/09/13.
 */
public class Truck implements Component{
    String name;
    String driveStat;

    public Truck(String name) {
        this.name = name;
    }

    public String getDriveStat() {
        return driveStat;
    }

    @Override
    public void drive() {
        driveStat=name+" Truck is driving";
    }
}
