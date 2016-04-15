import org.testng.Assert;
import org.testng.annotations.Test;
import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class IntegrationTest {

    /**
     * add your integration test here
     * in this example we just check if the welcome page is being shown
     */
    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                Assert.assertTrue(browser.pageSource().contains("Your new application is ready."));
            }
        });
    }

    @Test
    public void test1() {
        System.out.println("Dude");
    }

}
