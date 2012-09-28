package labs.openlogics.com.navomatic;

import org.apache.wicket.markup.html.border.Border;
import org.apache.wicket.markup.html.border.BoxBorder;

/**
 * Created with IntelliJ IDEA.
 * User: miguel
 * Date: 9/28/12
 * Time: 12:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class NavomaticBorder extends Border {
    public NavomaticBorder(String componentName) {
        super(componentName);    //To change body of overridden methods use File | Settings | File Templates.
        addToBorder(new BoxBorder("navigationBorder"));
        addToBorder(new BoxBorder("bodyBorder"));
    }
}
