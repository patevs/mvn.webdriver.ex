package org.pat.evs.WebDriverEx;

import org.pat.evs.WebDriverEx.ExampleSite;
import org.pat.evs.WebDriverEx.page.MainPage;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Firefox
@Chrome
@InternetExplorer
public class ExampleSiteTest {

    // Site
    public ExampleSite site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

}
