package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.HomeWork6.base.BasePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChoiceLocation extends BasePage {

    @FindBy(css = ".\\_6RmNBByo8N")
    private WebElement oldLocation;
    @FindBy(css = ".\\_2ACm4NQBiK > #header-search")
    private WebElement clickLocation;
    @FindBy(css = ".\\_2ACm4NQBiK > #header-search")
    private WebElement sendLocation;
    @FindBy(xpath = "//span[@class='hKCM_OMVVX']")
    private WebElement choiceLocation;
    @FindBy( xpath = "//span[text()='Продолжить с новым регионом']")
    private WebElement clickButton;

    @FindBy(xpath = "//div[@class='_3UPaiAsDwc']")
    private WebElement popUpWindows;
    @FindBy(xpath = "//span[@class='_18cRHgDUj2']")
    private WebElement popUpText;

    public ChoiceLocation(WebDriver driver) {
        super(driver);
    }

    @Step("Выбор местоположения")
    public ChoiceLocation enterOldPosition() {
        oldLocation.click();
        return this;
    }

    @Step("Выбор строки поиска")
    public ChoiceLocation enterChoicePosition() {
        clickLocation.click();
        return this;
    }

    @Step("Ввод данных {description}")
    public ChoiceLocation enterSendPosition(String description) {
        sendLocation.sendKeys(description);
        return this;
    }

    @Step("Выбор новой локации")
    public ChoiceLocation enterNewLocation() {
        choiceLocation.click();
        return this;
    }

    @Step("Продолжить с новым регионом")
    public ChoiceLocation enterButton() {
        clickButton.click();
        return this;
    }

    @Step("Проверка PopUp окна с новой локацией")
    public ChoiceLocation checkNewContactPopUp() {
        String message = wait10second.until(ExpectedConditions
                .presenceOfElementLocated(By.xpath("//div[@class='_3UPaiAsDwc']")))
                .getText();
        assertTrue(message.contains("Теперь вы видите товары\n" +
                "с доставкой в Калининград"));
        return this;
    }
}
