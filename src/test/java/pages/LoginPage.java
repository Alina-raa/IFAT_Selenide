package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    final SelenideElement userInput = $("[name='USER_LOGIN']");
    final SelenideElement passInput = $("[name='USER_PASSWORD']");
    final SelenideElement loginBtn = $("[name='Login']");

    public LoginPage openPage() {
        open("auth/?backurl=/personal/");
        return this;
    }

    public LoginPage login() {
        userInput.setValue("alinessar@gmail.com");
        passInput.setValue("jJFBmfH6r4DIPR3");
        loginBtn.submit();
        return this;
    }
}
