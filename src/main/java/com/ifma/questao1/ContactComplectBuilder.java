package com.ifma.questao1;

public class ContactComplectBuilder implements Builder{

    private ContactType contactType;

    private String name;

    private String address;

    private String phone;

    private String email;
    @Override
    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public ContactComplect getResult() {
        return new ContactComplect(contactType,name,address,phone,email);
    }
}
