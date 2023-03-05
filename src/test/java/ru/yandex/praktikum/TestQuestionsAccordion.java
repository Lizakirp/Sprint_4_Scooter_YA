package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.model.MainPage;

import static com.codeborne.selenide.Selenide.open;


public class TestQuestionsAccordion {
    private static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru";

    private static final String [] ANSWERS = {
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    };

    MainPage mainPage = open(MAIN_PAGE_URL, MainPage.class);

    @Test
    public void shouldQuestionOneWillBeCorrect() {
        mainPage.clickOnQuestion(0);
        Assert.assertEquals(ANSWERS[0], mainPage.getAnswerText(0));
    }

    @Test
    public void shouldQuestionTwoWillBeCorrect() {
        mainPage.clickOnQuestion(1);
        Assert.assertEquals(ANSWERS[1], mainPage.getAnswerText(1));
    }

    @Test
    public void shouldQuestionThreeWillBeCorrect() {
        mainPage.clickOnQuestion(2);
        Assert.assertEquals(ANSWERS[2], mainPage.getAnswerText(2));
    }

    @Test
    public void shouldQuestionFourWillBeCorrect() {
        mainPage.clickOnQuestion(3);
        Assert.assertEquals(ANSWERS[3], mainPage.getAnswerText(3));
    }

    @Test
    public void shouldQuestionFiveWillBeCorrect() {
        mainPage.clickOnQuestion(4);
        Assert.assertEquals(ANSWERS[4], mainPage.getAnswerText(4));
    }

    @Test
    public void shouldQuestionSixWillBeCorrect() {
        mainPage.clickOnQuestion(5);
        Assert.assertEquals(ANSWERS[5], mainPage.getAnswerText(5));
    }

    @Test
    public void shouldQuestionSevenWillBeCorrect() {
        mainPage.clickOnQuestion(6);
        Assert.assertEquals(ANSWERS[6], mainPage.getAnswerText(6));
    }

    @Test
    public void shouldQuestionEightWillBeCorrect() {
        mainPage.clickOnQuestion(7);
        Assert.assertEquals(ANSWERS[7], mainPage.getAnswerText(7));
    }
}
