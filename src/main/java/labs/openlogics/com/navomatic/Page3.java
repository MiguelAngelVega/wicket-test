package labs.openlogics.com.navomatic;

import org.apache.wicket.markup.html.WebPage;

/**
 * Created with IntelliJ IDEA.
 * User: miguel
 * Date: 9/28/12
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Page3 extends WebPage{
    public Page3() {
        add(new NavomaticBorder("navomaticBorder"));
    }
}
