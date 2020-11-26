package ru.geekbrains.HomeWork6.features.magazine;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.JavascriptExecutor;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.pages.Magazine;

import java.util.ArrayList;

@Feature("Magazine Test")
public class MagazineTest extends BaseTest{

    @Test
    void createMagazineTest() throws InterruptedException {
        Magazine readNews = new Magazine(driver);

        readNews.enterMagazineMarket()
                .enterGadgetsMenu()
                .enterDopMenu()
                .enterReviewNews()
                .enterReturnMagazine();
    }
}
