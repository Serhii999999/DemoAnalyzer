package com.demo.pages.JenkinsPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class ProjectPage {

    public void clickBuildLink(){
        element(By.xpath("//a[@tooltip='Success > Console Output']")).click();
    }
}
