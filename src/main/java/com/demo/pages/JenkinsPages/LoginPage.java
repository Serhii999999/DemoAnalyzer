package com.demo.pages.JenkinsPages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.element;

public class LoginPage {
    public void logInSystem(String login, String password) {
        element(By.id("j_username")).sendKeys(login);
        element(By.id("j_password")).sendKeys(password);
        element(By.xpath("//*[@name='Submit']")).click();
    }
}
