package org.pat.evs.WebDriverEx;

import org.pat.evs.WebDriverEx.page.MainPage;
import com.github.webdriverextensions.WebSite;
import static com.github.webdriverextensions.Bot.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleSite extends WebSite {

    // Logger
    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(ExampleSite.class);

    // Url
    public static String url = "http://localhost:8181";

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

    public void open(Object... arguments) {
        open(url);
    }

    @Override
    public void assertIsOpen(Object... arguments) throws Error {
        assertCurrentUrlStartsWith(url);
    }

}
