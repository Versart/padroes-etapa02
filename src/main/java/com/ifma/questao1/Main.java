package com.ifma.questao1;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        ContactComplectBuilder contactComplectBuilder = new ContactComplectBuilder();
        director.constructContactComplect(contactComplectBuilder);
        ContactComplect contactComplect = contactComplectBuilder.getResult();
        System.out.println(contactComplect);

        ContactPhoneBuilder contactPhoneBuilder = new ContactPhoneBuilder();
        director.constructContactPhone(contactPhoneBuilder);
        ContactPhone contactPhone = contactPhoneBuilder.getResult();
        System.out.println(contactPhone);

        ContactInternetBuilder contactInternetBuilder = new ContactInternetBuilder();
        director.constructContactInternet(contactInternetBuilder);
        ContactInternet contactInternet = contactInternetBuilder.getResult();
        System.out.println(contactInternet);
    }
}