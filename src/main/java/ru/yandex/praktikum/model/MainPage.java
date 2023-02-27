package ru.yandex.praktikum.model;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {

    public static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru";
    public static final String [] ANSWERS = {
            "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",
            "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",
            "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",
            "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",
            "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",
            "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.",
            "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",
            "Да, обязательно. Всем самокатов! И Москве, и Московской области."
    };

    // логотип Яндекса в шапке страницы
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoYandex__3TSOI")
    private SelenideElement yandexLogo;

    // логотип Самоката в шапке страницы
    @FindBy(how = How.CLASS_NAME,using = "Header_LogoScooter__3lsAR")
    private SelenideElement scooterLogo;

    // дисклеймер "учебный тренажер" в шапке страницы
    @FindBy(how = How.CLASS_NAME, using = "Header_Disclaimer__3VEni")
    private SelenideElement headerDisclaimer;

    // кнопка "Заказать" в шапке страницы
    @FindBy(how = How.XPATH,using = "//div[@class='Header_Nav__AGCXC']/button[text()='Заказать']")
    private SelenideElement orderButtonHeader;

    // кнопка "Заказать" в конце страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FinishButton__1_cWm']/button[text()='Заказать']")
    private SelenideElement orderButtonBottom;

    // кнопка "Статус заказа" в шапке страницы
    @FindBy(how = How.XPATH, using = "//div[@class='Header_Nav__AGCXC']/button[text()='Статус заказа']")
    private SelenideElement orderStatusButtonHeader;

    // строка поиска заказа
    @FindBy(how = How.XPATH, using = "//div[@class='Header_SearchInput__3YRIQ']/div/input")
    private SelenideElement searchOrderField;

    // кнопка начала поиска Go!
    @FindBy(how = How.XPATH, using = "//div[@class='Header_SearchInput__3YRIQ']/button")
    private SelenideElement searchOrderButton;

    // гланый title страницы, 1 строка
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX']/text()[1]")
    private SelenideElement titleFirstLine;

    // главный title страницы, 2 строка
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Header__iJKdX']/text()[2]")
    private SelenideElement titleSecondLine;

    // картинка, схематическое изображение самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_BluePrint__TGX2n']/img[@alt='Scooter blueprint']")
    private SelenideElement scooterBlueprintImage;

    // картинка, фотография самоката
    @FindBy(how = How.XPATH, using = "//div[@class='Home_Scooter__3YdJy']/img[@alt='Scooter blueprint']")
    private SelenideElement scooterPhotoImage;

    // subheader 3, "Как это работает"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_ThirdPart__LSTEE']/div[@class='Home_SubHeader__zwi_E']/text()")
    private SelenideElement subheaderHowItWorks;

    // "Как это работает", шаг 1, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[1]/div[@class='Home_StatusCircle__3_aTp']")
    private SelenideElement numberOfFirstStep;

    // "Как это работает", шаг 1, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[1]/div[2]/div[@class='Home_Status__YkfmH']")
    private SelenideElement firstStepTitle;

    // "Как это работает", шаг 1, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[1]/div[2]/div[@class='Home_StatusDescription__3WGl5']")
    private SelenideElement firstStepDescription;

    // "Как это работает", шаг 2, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[2]/div[@class='Home_StatusCircle__3_aTp']")
    private SelenideElement numberOfSecondStep;

    // "Как это работает", шаг 2, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[2]/div[2]/div[@class='Home_Status__YkfmH']")
    private SelenideElement secondStepTitle;

    // "Как это работает", шаг 2, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[2]/div[2]/div[@class='Home_StatusDescription__3WGl5']")
    private SelenideElement secondStepDescription;

    // "Как это работает", шаг 3, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[3]/div[@class='Home_StatusCircle__3_aTp']")
    private SelenideElement numberOfThirdStep;

    // "Как это работает", шаг 3, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[3]/div[2]/div[@class='Home_Status__YkfmH']")
    private SelenideElement thirdStepTitle;

    // "Как это работает", шаг 3, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[3]/div[2]/div[@class='Home_StatusDescription__3WGl5']")
    private SelenideElement thirdStepDescription;

    // "Как это работает", шаг 4, номер шага
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[4]/div[1]")
    private SelenideElement numberOfFourthStep;

    // "Как это работает", шаг 4, title
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[4]/div[2]/div[1]")
    private SelenideElement fourthStepTitle;

    // "Как это работает", шаг 4, описание
    @FindBy(how = How.XPATH, using = "//div[@class='Home_RoadMap__2tal_']/div[4]/div[2]/div[2]")
    private SelenideElement fourthStepDescription;

    // секция "Вопросы о важном"
    @FindBy(how = How.XPATH, using = "//div[@class='Home_FourPart__1uthg']")
    private SelenideElement questionsSection;

    // Вопрос 1 - Сколько это стоит и как оплатить?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-8']")
    private SelenideElement questionOne;

    // Ответ 1
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-8']")
    private SelenideElement answerOne;

    // Вопрос 2 - Хочу сразу несколько самокатов! Так можно?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-9']")
    private SelenideElement questionTwo;

    // Ответ 2
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-9']")
    private SelenideElement answerTwo;

    // Вопрос 3 - Как рассчитывается время аренды?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-10']")
    private SelenideElement questionThree;

    // Ответ 3
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-10']")
    private SelenideElement answerThree;

    // Вопрос 4 - Можно ли заказать самокат прямо на сегодня?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-11']")
    private SelenideElement questionFour;

    // Ответ 4
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-11']")
    private SelenideElement answerFour;

    // Вопрос 5 - Можно ли продлить заказ или вернуть самокат раньше?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-12']")
    private SelenideElement questionFive;

    // Ответ 5
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-12']")
    private SelenideElement answerFive;

    // Вопрос 6 - Вы привозите зарядку вместе с самокатом?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-13']")
    private SelenideElement questionSix;

    // Ответ 6
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-13']")
    private SelenideElement answerSix;

    // Вопрос 7 - Можно ли отменить заказ?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-14']")
    private SelenideElement questionSeven;

    // Ответ 7
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-14']")
    private SelenideElement answerSeven;

    // Вопрос 8 - Можно ли отменить заказ?
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__heading-15']")
    private SelenideElement questionEight;

    // Ответ 8
    @FindBy(how = How.XPATH, using = "//div[@id='accordion__panel-15']")
    private SelenideElement answerEight;

    // Коллекция вопросов
    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemHeading']")
    public ElementsCollection questionsAccordion;

    // Коллекция ответов
    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemPanel']")
    public ElementsCollection answersAccordion;

    public void clickOnOrderButtonInHeader() {
        orderButtonHeader.click();
    }

    public void clickOnOrderButtonInBottom() {
        orderButtonBottom.scrollIntoView(true).click();
    }

    public void clickOnQuestion(int questionNumber) {
        questionsAccordion.get(questionNumber).scrollIntoView(true).click();
    }

    public String getAnswerText(int answerNumber) {
        answersAccordion.get(answerNumber).shouldBe(Condition.visible);
        return answersAccordion.get(answerNumber).text();
    }

}
