package ru.geekbrains.HomeWork6.features.choicelocation;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.pages.ChoiceLocation;

@Feature("ChoiceLocation Test")
public class ChoiceLocationTest extends BaseTest {

    @Test
    void createLocationTest() throws InterruptedException {
        ChoiceLocation choiceLocationPage = new ChoiceLocation(driver);

        choiceLocationPage
                .enterOldPosition()
                .enterChoicePosition()
                .enterSendPosition("Калининград");
        Thread.sleep(1000);
        choiceLocationPage
                .enterNewLocation()
                .enterButton()
                .checkNewContactPopUp();
        Thread.sleep(5000);
    }
}
