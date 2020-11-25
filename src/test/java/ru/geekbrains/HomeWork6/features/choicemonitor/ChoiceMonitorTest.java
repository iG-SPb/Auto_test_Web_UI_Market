package ru.geekbrains.HomeWork6.features.choicemonitor;

import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import ru.geekbrains.HomeWork6.base.BaseTest;
import ru.geekbrains.HomeWork6.pages.ChoiceLocation;
import ru.geekbrains.HomeWork6.pages.ChoiceMonitor;

@Feature("ChoiceMonitor Test")
public class ChoiceMonitorTest extends BaseTest{

    static Faker faker = new Faker();
    String tmpName = faker.pokemon().name();

    @Test
    void createMonitorTest() throws InterruptedException {
        ChoiceMonitor choiceMonitor = new ChoiceMonitor(driver);

        choiceMonitor.enterMainCatalog();
        Thread.sleep(2000);
        choiceMonitor.enterCompCatalog();
        Thread.sleep(2000);
        choiceMonitor.enterMonitorCatalog();
        Thread.sleep(2000);
        choiceMonitor.enterMonitorLG();
        Thread.sleep(3000);
        choiceMonitor.enterMonitorResolution();
        Thread.sleep(3000);
        choiceMonitor.enterMonitorIPS();
        Thread.sleep(3000);
        choiceMonitor.enterSelectPrice();
        Thread.sleep(3000);
        choiceMonitor.enterAppendFavorites();
        Thread.sleep(5000);
        choiceMonitor.enterClickFavorites();
        Thread.sleep(3000);
    }
}
