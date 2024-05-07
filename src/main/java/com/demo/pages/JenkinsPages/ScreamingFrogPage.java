package com.demo.pages.JenkinsPages;

import com.demo.actions.MainActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.element;


public class ScreamingFrogPage {
    private MainActions actions;
    public ScreamingFrogPage(){
        actions = new MainActions();
    }
    public void frogLink(){
        actions.clickWithJS(element(By.xpath("//span[text()='ScreamingFrog']")));
    }
    public void preprodLinkClick(){
        actions.clickWithJS(element(By.xpath("//td//span[text()='preprod']")));
    }
    public void prodLinkClick(){
        actions.clickWithJS(element(By.xpath("//td//span[text()='prod']")));
    }

}
