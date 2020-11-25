package ru.geekbrains.HomeWork6.features.choicemonitor;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.pages.ChoiceLocation;

@Feature("ChoiceMonitor Test")
public class ChoiceMonitorTest extends BaseTest{

    static Faker faker = new Faker();
    String tmpName = faker.pokemon().name();

    @Test
    void createNewProjectsTest() throws InterruptedException {
        ChoiceLocation choiceMonitor = new ChoiceLocation(driver);

//        projectPage
//                .clickOnCreateNewProjectsButton()
        Thread.sleep(3000);
    }
}
