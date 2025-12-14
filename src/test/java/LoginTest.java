import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {
    @Test
    public void projectIsOpen() {
        loginPage
                .openPage()
                .login();
        projectsPage.waiteOpen();
    }
}
