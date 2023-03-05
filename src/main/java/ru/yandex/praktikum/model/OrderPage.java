package ru.yandex.praktikum.model;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;

public class OrderPage {

    // title формы заказа самоката
    @FindBy(how = How.CSS, using = ".Order_Header__BZXOb")
    private SelenideElement orderFormTitle;

    // поле Имя формы заказа самоката
    @FindBy(how = How.CSS, using = "input[placeholder='* Имя']")
    private SelenideElement orderFormFirstNameField;

    // поле Фамилия формы заказа самоката
    @FindBy(how = How.CSS, using = "input[placeholder='* Фамилия']")
    private SelenideElement orderFormLastNameField;

    // поле Адрес формы заказа самоката
    @FindBy(how = How.CSS, using = "input[placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement orderFormAddressField;

    // селектор Станция метро формы заказа самоката
    @FindBy(how = How.CSS, using = "input[placeholder='* Станция метро']")
    private SelenideElement orderFormMetroStationField;

    // поле Телефон формы заказа самоката
    @FindBy(how = How.CSS, using = "input[placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement orderFormPhoneField;

    // кнопка Назад формы заказа самоката
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Назад')]")
    private SelenideElement orderFormBackButton;

    // кнопка Дальше формы заказа самоката
    @FindBy(how = How.CSS, using = ".Order_NextButton__1_rCA > button")
    private SelenideElement orderFormNextButton;

    // поле Дата начала аренды формы заказа самоката
    @FindBy(how = How.CSS, using = "input[placeholder='* Когда привезти самокат']")
    private SelenideElement orderFormStartDateField;

    // поле Продолжительность аренды формы заказа самоката
    @FindBy(how = How.CSS, using = ".Dropdown-control")
    private SelenideElement orderFormDurationField;

    // title цветов самоката формы заказа самоката
    @FindBy(how = How.CSS, using = ".Order_Title__3EKne")
    private SelenideElement orderFormScooterColorTitle;

    // чекбокс черный самокат формы заказа самоката
    @FindBy(how = How.ID, using = "black")
    private SelenideElement orderFormBlackScooterCheckbox;

    // подпись к чекбоксу черный самокат формы заказа самоката
    @FindBy(how = How.CSS, using = "label[for='black']")
    private SelenideElement orderFormBlackScooterLabel;

    // чекбокс серый самокат формы заказа самоката
    @FindBy(how = How.ID, using = "grey")
    private SelenideElement orderFormGreyScooterCheckbox;

    // подпись к чекбоксу серый самокат формы заказа самоката
    @FindBy(how = How.CSS, using = "label[for='grey']")
    private SelenideElement orderFormGreyScooterLabel;

    // поле Комментарий формы заказа самоката
    @FindBy(how = How.CSS, using = "input[placeholder='Комментарий для курьера']")
    private SelenideElement orderFormCommentField;

    // кнопка завершения оформления заказа "Заказать"
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Заказать')]")
    private SelenideElement orderFormOrderButton;

    // попап подтверждения заказа / попап с информацией о созданном заказе
    @FindBy(how = How.CSS, using = ".Order_Modal__YZ-d3")
    private SelenideElement orderPopup;

    // title попапа подтверждения заказа / попапа с информацией о созданном заказе
    @FindBy(how = How.CSS, using = ".Order_ModalHeader__3FDaJ")
    private SelenideElement orderPopupTitle;

    // номер заказа в попапе с информацией о заказе
    @FindBy(how = How.XPATH, using = "//div[@class='Order_Text__2broi']/text()[2]")
    private SelenideElement orderPopupOrderNumber;

    // кнопка Да в попапе подтверждения заказа
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Да')]")
    private SelenideElement confirmOrderPopupConfirmButton;

    // кнопка Нет в попапе подтверждения заказа
    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Нет')]")
    private SelenideElement confirmOrderPopupCancelButton;

    // кнопка проверить статус заказа в попапе с информацией о заказе
    @FindBy(how = How.CSS, using = ".Order_Modal__YZ-d3 > div > button")
    private SelenideElement orderPopupCheckStatusButton;

    public void fillOrderFormStepOne(String firstName, String lastName, String address, String metroStation, String phone) {
        orderFormFirstNameField.setValue(firstName);
        orderFormLastNameField.setValue(lastName);
        orderFormAddressField.setValue(address);
        orderFormMetroStationField.click();
        $(By.xpath(String.format("//div[text()='%s']", metroStation))).scrollIntoView(true).click();
        orderFormPhoneField.setValue(phone);
    }

    public void goToNextStep() {
        orderFormNextButton.click();
    }

    public void fillOrderFormStepTwo(String startDate, String duration, boolean isBlack, boolean isGrey, String comment) {
        orderFormStartDateField.setValue(startDate);
        setDuration(duration);
        setBlackScooter(isBlack);
        setGreyScooter(isGrey);
        orderFormCommentField.setValue(comment);
    }

    private void setDuration(String duration) {
        orderFormTitle.click();
        orderFormDurationField.click();
        $(By.xpath(String    .format("//div[@class='Dropdown-menu']/div[text()='%s']", duration)))
                .scrollIntoView(true).click();
    }

    private void setBlackScooter(boolean isBlack) {
        if (isBlack) {
            orderFormBlackScooterCheckbox.click();
        }
    }

    private void setGreyScooter(boolean isGrey) {
        if (isGrey) {
            orderFormGreyScooterCheckbox.click();
        }
    }

    public void submitOrderForm() {
        orderFormOrderButton.click();
    }

    public void confirmOrderPopup(boolean isConfirm) {
        if (isConfirm) {
            confirmOrderPopupConfirmButton.click();
        } else {
            confirmOrderPopupCancelButton.click();
        }
    }

    public void goToOrderStatus() {
        orderPopupCheckStatusButton.click();
    }

    public String getPopupTitleText() {
        return orderPopupTitle.text();
    }

    public String getOrderNumber() {
        return orderPopupOrderNumber.text();
    }}


