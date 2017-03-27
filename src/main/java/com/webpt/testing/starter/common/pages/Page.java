package com.webpt.testing.starter.common.pages;

import org.openqa.selenium.WebDriver;

/**
 * All pages should extend this.
 * You can do custom stuff here that is common across many pages in your project.
 */
public class Page extends net.serenitybdd.core.pages.PageObject {

    public Page(WebDriver driver) {
        super(driver);
    }
    
    public void waitForReady() {
    	  
   }
}
