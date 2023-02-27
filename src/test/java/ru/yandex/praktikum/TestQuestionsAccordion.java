package ru.yandex.praktikum;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.yandex.praktikum.model.MainPage;

import static com.codeborne.selenide.Selenide.open;


public class TestQuestionsAccordion {

    MainPage mainPage = open(MainPage.MAIN_PAGE_URL, MainPage.class);

    @Test
    public void shouldQuestionOneWillBeCorrect() {
        mainPage.clickOnQuestion(0);
        Assert.assertEquals(mainPage.ANSWERS[0], mainPage.getAnswerText(0));
    }

    @Test
    public void shouldQuestionTwoWillBeCorrect() {
        mainPage.clickOnQuestion(1);
        Assert.assertEquals(mainPage.ANSWERS[1], mainPage.getAnswerText(1));
    }

    @Test
    public void shouldQuestionThreeWillBeCorrect() {
        mainPage.clickOnQuestion(2);
        Assert.assertEquals(mainPage.ANSWERS[2], mainPage.getAnswerText(2));
    }

    @Test
    public void shouldQuestionFourWillBeCorrect() {
        mainPage.clickOnQuestion(3);
        Assert.assertEquals(mainPage.ANSWERS[3], mainPage.getAnswerText(3));
    }

    @Test
    public void shouldQuestionFiveWillBeCorrect() {
        mainPage.clickOnQuestion(4);
        Assert.assertEquals(mainPage.ANSWERS[4], mainPage.getAnswerText(4));
    }

    @Test
    public void shouldQuestionSixWillBeCorrect() {
        mainPage.clickOnQuestion(5);
        Assert.assertEquals(mainPage.ANSWERS[5], mainPage.getAnswerText(5));
    }

    @Test
    public void shouldQuestionSevenWillBeCorrect() {
        mainPage.clickOnQuestion(6);
        Assert.assertEquals(mainPage.ANSWERS[6], mainPage.getAnswerText(6));
    }

    @Test
    public void shouldQuestionEightWillBeCorrect() {
        mainPage.clickOnQuestion(7);
        Assert.assertEquals(mainPage.ANSWERS[7], mainPage.getAnswerText(7));
    }
}
