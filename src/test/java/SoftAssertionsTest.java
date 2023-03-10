import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionsTest {
    @Test
    void softAssertionsIsOnTheWikiPage(){
//  Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
//  Перейдите в раздел Wiki проекта
        $("#wiki-tab").click();
//  Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $(".wiki-pages-box button").click();
        $(".wiki-pages-box").shouldHave(text("SoftAssertions"));
//  Откройте страницу SoftAssertions, проверьте, что внутри есть пример кода для JUnit5
        $(".wiki-pages-box").$(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
