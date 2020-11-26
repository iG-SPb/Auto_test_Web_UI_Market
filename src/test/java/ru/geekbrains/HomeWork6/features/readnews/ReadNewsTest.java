package ru.geekbrains.HomeWork6.features.readnews;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.pages.ReadNews;

import java.util.ArrayList;

@Feature("ReadNews Test")
public class ReadNewsTest extends BaseTest{

    @Test
    void createReadNewsTest() throws InterruptedException {
        ReadNews readNews = new ReadNews(driver);
        JavascriptExecutor js = ((JavascriptExecutor) driver);

        // sleep добавлены только для визуализации процесса

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        readNews.enterMainNews();
        Thread.sleep(3000);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        readNews.enterFirstNews();
        Thread.sleep(3000);
        readNews.enterAllNews();
        Thread.sleep(3000);
        readNews.enterSecondNews();
        Thread.sleep(3000);
        readNews.enterAllNews();
        Thread.sleep(3000);
        readNews.enterDopNews();
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs2.get(0));
        Thread.sleep(1000);
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
        Thread.sleep(3000);
    }
}
