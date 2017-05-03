package ua.skillsup.java0.practice5.enums;

import java.util.Arrays;

/**
 * @author Anton Chernetskij
 */
public class Client {
    private UserStatus status;

    public static void main(String[] args) {
        Client client = new Client();
        client.status = UserStatus.AWAIT_CONFIRMATION;
        System.out.println(client.status);
        System.out.println(client.status.redirectUrl);
        System.out.println(Arrays.toString(UserStatus.values()));
    }

    enum UserStatus {
        ACTIVE("index"),
        LOCKED("error"),
        AWAIT_CONFIRMATION("confirmationPage");

        private UserStatus(String redirectUrl) {
            this.redirectUrl = redirectUrl;
        }

        String redirectUrl;
    }
}
