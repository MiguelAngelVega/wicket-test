package labs.openlogics.com;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

/**
 * Created with IntelliJ IDEA.
 * User: miguel
 * Date: 9/28/12
 * Time: 11:18 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorld extends WebPage{
    public HelloWorld() {
        add(new Label("message", "hello world"));
    }
}
