package labs.openlogics.com.navomatic;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

/**
 * Created with IntelliJ IDEA.
 * User: miguel
 * Date: 9/28/12
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class NavomaticApplication extends WebApplication{
    public NavomaticApplication() {
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return Page1.class;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
