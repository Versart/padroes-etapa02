package com.ifma.questao1;

public class Director {


    public void constructContactComplect(Builder builder) {
        builder.setContactType(ContactType.CONTACT_COMPLECT);
        builder.setName("Maria");
        builder.setAddress("Rua A");
        builder.setPhone("21212");
        builder.setEmail("maria@email.com");
    }

    public void constructContactPhone(Builder builder) {
        builder.setContactType(ContactType.CONTACT_PHONE);
        builder.setName("Maria");
        builder.setPhone("21212");
    }

    public void constructContactInternet(Builder builder) {
        builder.setContactType(ContactType.CONTACT_INTERNET);
        builder.setName("Maria");
        builder.setEmail("maria@email.com");
    }
}
