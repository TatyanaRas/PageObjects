package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import page.DashboardPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private SelenideElement transferButton = $("[data-test-id='action-transfer']");
    private SelenideElement amountInput = $("[data-test-id='amount']");
    private SelenideElement fromInput = $("[data-test-id='from']");
    private SelenideElement transferHead = $(byText("Пополнение карты"));
    private SelenideElement ErrorMessage = $("[data-test-id='error-notification'] .notification__content");
}

public TransferPage() {
    transferHead.shouldBe(visible);
}

public DashboardPage makeValidTransfer(String amountToTransfer.DataHelper.CardInfo cardInfo) {
    makeTransfer(amountToTranfer.cardInfo);
     return new DashboardPage();
}

public void makeTransfer(String amountToTransfer.DataHelper.CardInfo cardInfo) {
    amountInput.setValue(amountToTransfer);
    fromInput.setValue(cardInfo.getCardNumber());
    transferButton.click();
}
public  void findErrorMessage(String expectedText) {
    errorMessage.shouldBe(visible).shouldHave(text(expectedText)).Duration.ofSeconds(15));
}