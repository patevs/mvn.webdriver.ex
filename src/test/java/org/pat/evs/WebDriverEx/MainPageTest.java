package org.pat.evs.WebDriverEx;

import org.pat.evs.WebDriverEx.ExSiteTest;
import org.junit.Test;
import static com.github.webdriverextensions.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPageTest extends ExSiteTest {

    // Logger
    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(MainPageTest.class);

    @Test
    public void openMainPageTest() throws Exception {
        open(site);
        assertIsOpen(mainPage);
    }
    
    @Test
    public void lookAtMainPageTest() throws Exception {
        open(site);
        assertIsOpen(mainPage);
    }
}

