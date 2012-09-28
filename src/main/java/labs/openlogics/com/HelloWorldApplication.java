package labs.openlogics.com;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created with IntelliJ IDEA.
 * User: miguel
 * Date: 9/28/12
 * Time: 11:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldApplication extends WebApplication{
    public HelloWorldApplication() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return HelloWorld.class;
    }
}
