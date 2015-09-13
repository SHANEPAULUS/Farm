import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHANE on 2015/09/13.
 */
public class Composite implements Component {

    List<Component> components=new ArrayList<Component>();

    @Override
    public void drive() {
        for(Component component:components)
        {
            component.drive();
        }
    }

    public void add(Component component)
    {
        this.components.add(component);
    }

    public void remove(Component component)
    {
        this.components.remove(component);
    }

    List<Component> getComponents()
    {
        return components;
    }

    public Component getComponent(int index)
    {
        return components.get(index);
    }
}
