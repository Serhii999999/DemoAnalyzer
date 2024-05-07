package com.demo.pages.JenkinsPages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.element;

public class BuildPage {

    public void clickConsoleOutputButton(){
        element(By.xpath("//*[text()='Console Output']")).click();
    }
    public void clickFullLogButton(){
        element(By.xpath("//a[text()='Full Log']")).click();
    }
}
