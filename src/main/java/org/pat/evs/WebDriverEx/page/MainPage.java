package org.pat.evs.WebDriverEx.page;

import org.pat.evs.WebDriverEx.ExSite;
import org.pat.evs.WebDriverEx.component.ExampleWebComponent;
import com.github.webdriverextensions.WebPage;
import org.openqa.selenium.support.FindBy;
import static com.github.webdriverextensions.Bot.*;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainPage extends WebPage {

    // Logger
    @SuppressWarnings("unused")
	private static final Logger log = LoggerFactory.getLogger(MainPage.class);

    // Url
    public String url = ExSite.url;

    // Model
    @FindBy(css = "cssselector")
    public WebElement exampleWebElement;
    @FindBy(css = "cssselector")
    public ExampleWebComponent exampleWebComponent;
    // ...add your Page's WebElements and WebComponents here

    @Override
    public void open(Object... arguments) {
        open(url);
        assertIsOpen();
    }

    @Override
    public void assertIsOpen(Object... arguments) throws Error {
        assertCurrentUrlStartsWith(url);
        // ...add your asserts that ensures that the page is loaded
    }

}
