package org.pat.evs.WebDriverEx;

import org.pat.evs.WebDriverEx.ExSite;
import org.pat.evs.WebDriverEx.page.MainPage;
import com.github.webdriverextensions.junitrunner.WebDriverRunner;
import com.github.webdriverextensions.junitrunner.annotations.Chrome;
import com.github.webdriverextensions.junitrunner.annotations.Firefox;
//import com.github.webdriverextensions.junitrunner.annotations.HtmlUnit;
//import com.github.webdriverextensions.junitrunner.annotations.InternetExplorer;
import com.github.webdriverextensions.junitrunner.annotations.PhantomJS;

import org.junit.runner.RunWith;

@RunWith(WebDriverRunner.class)
@Firefox
@Chrome
//@InternetExplorer
@PhantomJS
//@HtmlUnit
public class ExSiteTest {

    // Site
    public ExSite site;

    // Pages
    public MainPage mainPage;
    // ...add your Site's WebPages here

}
