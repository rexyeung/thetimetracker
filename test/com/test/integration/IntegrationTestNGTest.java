package com.test.integration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import play.test.FakeApplication;
import play.test.Helpers;
import play.test.TestServer;

/**
 * Created by rexromoloyeung on 2016-01-15.
 */
public class IntegrationTestNGTest {

    private static long timeout = 5000L;
    private static FakeApplication app;
    private static TestServer server;

    @BeforeClass
    public void setupServerBeforeTestRun() {

        // Set up the fake application and test server
        app = Helpers.fakeApplication(Helpers.inMemoryDatabase());
        server = Helpers.testServer(3333, app);
        Helpers.start(server);
    }

    @Test
    public void randomTest() {

        System.out.println("Hello Test");
        Assert.assertTrue(true);
    }

}
