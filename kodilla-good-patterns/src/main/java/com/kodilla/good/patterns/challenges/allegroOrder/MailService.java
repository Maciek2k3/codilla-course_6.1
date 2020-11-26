package com.kodilla.good.patterns.challenges.allegroOrder;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println(user + "You finally booked ");
    }
}
