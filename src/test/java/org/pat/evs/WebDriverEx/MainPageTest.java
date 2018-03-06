package org.pat.evs.WebDriverEx;

import org.pat.evs.WebDriverEx.ExampleSiteTest;
import org.junit.Test;
import static com.github.webdriverextensions.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPageTest extends ExampleSiteTest {

    // Logger
    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void openMainPageTest() throws Exception {
        open(site);
        assertIsOpen(mainPage);
    }
}

