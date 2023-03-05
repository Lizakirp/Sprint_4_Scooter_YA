package ru.yandex.praktikum;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.hamcrest.MatcherAssert;
import org.junit.Assert;
import org.junit.Test;
import ru.yandex.praktikum.model.Customer;
import ru.yandex.praktikum.model.MainPage;
import ru.yandex.praktikum.model.OrderDetails;
import ru.yandex.praktikum.model.OrderPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.screenshot;
import static org.hamcrest.CoreMatchers.containsString;

public class TestOrderScooter {
    private static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru";


    Customer firstCustomer = new Customer(
            "Елизавета",
            "Кирпинская",
            "Коптевская 8",
            "Войковская",
            "89032520047"
    );

    Customer secondCustomer = new Customer(
            "Лев",
            "Толстой",
            "Ленина, 111",
            "Сокольники",
            "88888888888"
    );

    OrderDetails firstOrder = new OrderDetails(
            "12.25.2023",
            "сутки",
            true,
            false,
            "test"
    );

    OrderDetails secondOrder = new OrderDetails(
            "24.03.2023",
            "двое суток",
            false,
            true,
            "Hellow"
    );

    // From header Order button with Chrome driver
    @Test
    public void shouldSeePopupWithOrderInformationFromHeader() {
        MainPage mainPage = open(MAIN_PAGE_URL, MainPage.class);
        mainPage.clickOnOrderButtonInHeader();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne(firstCustomer.firstName, firstCustomer.lastName, firstCustomer.orderAddress, firstCustomer.metroStation, firstCustomer.phoneNumber);
        orderPage.goToNextStep();
        orderPage.fillOrderFormStepTwo(firstOrder.startDate, firstOrder.duration, firstOrder.isScooterBlack, firstOrder.isScooterGrey, firstOrder.comment);
        orderPage.submitOrderForm();
        orderPage.confirmOrderPopup(true);
        orderPage.goToOrderStatus();
        MatcherAssert.assertThat(orderPage.getPopupTitleText(), containsString("Заказ оформлен"));
    }

    // From header Order button with Firefox
    @Test
    public void shouldSeePopupWithOrderInformationFromBottom() {
        Configuration.browser = "firefox";
        MainPage mainPage = open(MAIN_PAGE_URL, MainPage.class);
        mainPage.clickOnOrderButtonInBottom();
        OrderPage orderPage = page(OrderPage.class);
        orderPage.fillOrderFormStepOne(secondCustomer.firstName, secondCustomer.lastName, secondCustomer.orderAddress, secondCustomer.metroStation, secondCustomer.phoneNumber);
        orderPage.goToNextStep();
        orderPage.fillOrderFormStepTwo(secondOrder.startDate, secondOrder.duration, secondOrder.isScooterBlack, secondOrder.isScooterGrey, secondOrder.comment);
        orderPage.submitOrderForm();
        orderPage.confirmOrderPopup(true);
        System.out.println(orderPage.getPopupTitleText());
        MatcherAssert.assertThat(orderPage.getPopupTitleText(), containsString("Заказ оформлен"));
    }
}
