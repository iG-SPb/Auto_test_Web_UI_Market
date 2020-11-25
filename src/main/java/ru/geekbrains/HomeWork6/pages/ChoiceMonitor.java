package ru.geekbrains.HomeWork6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.geekbrains.HomeWork6.base.BasePage;

public class ChoiceMonitor extends BasePage {
    @FindBy(xpath = "//div[@data-apiary-widget-name='@MarketNode/HeaderCatalogEntrypoint']")
    private WebElement mainCatalog;
    @FindBy(xpath = "//span[text()='Компьютерная техника']")
    //button[@id='91540057-tab']
    private WebElement compCatalog;
    @FindBy(xpath = "(//a[contains(text(),'Мониторы')])[2]")
    private WebElement monitorCatalog;
    @FindBy(xpath = "//span[@class='NVoaOvqe58' and text()='LG']")
    private WebElement monitorLG;
    @FindBy( xpath = "//span[@class='NVoaOvqe58' and text()='2560x1440']")
    private WebElement monitorResolution;
    @FindBy(xpath = "//span[@class='NVoaOvqe58' and text()='IPS']")
    private WebElement monitorIPS;
    @FindBy(css = ".\\_3tIaiy1WMf")
    private WebElement selectPrice;
    @FindBy(xpath = "(//div[@class='_2UmyXf5e76'])[1]")
    //@FindBy(xpath = "//div[@class='_2IwbFpEZn7 _3ockuJ8ZYf _1rDffWmsUY']")
    private WebElement appendFavorites;
    //@FindBy(xpath = "//*[@title='Избранное']")
    @FindBy(xpath = "//span[text()='Перейти в избранное']")
    private WebElement clickFavorites;

    public ChoiceMonitor(WebDriver driver) {
        super(driver);
    }

    @Step("Выбор главного каталого")
    public ChoiceMonitor enterMainCatalog() {
        mainCatalog.click();
        return this;
    }

    @Step("Выбор компьютерного каталога")
    public ChoiceMonitor enterCompCatalog() {
        compCatalog.click();
        return this;
    }

    @Step("Выбор каталога мониторов")
    public ChoiceMonitor enterMonitorCatalog() {
        monitorCatalog.click();
        return this;
    }

    @Step("Выбор мониторов LG")
    public ChoiceMonitor enterMonitorLG() {
        monitorLG.click();
        return this;
    }

    @Step("Выбор мониторов 2560х1440")
    public ChoiceMonitor enterMonitorResolution() {
        monitorResolution.click();
        return this;
    }

    @Step("Выбор мониторов IPS")
    public ChoiceMonitor enterMonitorIPS() {
        monitorIPS.click();
        return this;
    }

    @Step("Сортировка по цене")
    public ChoiceMonitor enterSelectPrice() {
        selectPrice.click();
        return this;
    }

    @Step("Сортировка по цене")
    public ChoiceMonitor enterAppendFavorites() {
        appendFavorites.click();
        return this;
    }

    @Step("Сортировка по цене")
    public ChoiceMonitor enterClickFavorites() {
        clickFavorites.click();
        return this;
    }
}
