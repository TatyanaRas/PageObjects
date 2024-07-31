package data;

import lombok.Value;

import java.util.Random;

public class DataHelper {
    private DataHelper() {

    }

   /* public static String getVerificationCode() {
        return "12345";
         }*/

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static CardInfo getFirstCardInfo() {
        return new CardInfo("", "");
    }

    public static CardInfo getSecondCardInfo() {
        return new CardInfo("", "");
    }

 /*   public static String getMaskedNumber(String cardNumber) {

        return "**** **** ****" + cardNumber.substring(15);

    }*/

    public static int generateValidAmount(int balance) {

        return new Random().nextInt(Math.abs(balance)) + 1;
    }

    public static int generateInvalidAmount(int balance) {

        return Math.abs(balance) + new Random().nextInt(10000);
    }


    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }


    /*  public static AuthInfo getOtherAuthInfo(AuthInfo original) {
          return new AuthInfo("petya", "123qwerty");
      }
  */
    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }
}