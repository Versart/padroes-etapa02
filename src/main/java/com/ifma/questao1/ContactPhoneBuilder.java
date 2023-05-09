package com.ifma.questao1;

public class ContactPhoneBuilder implements Builder{

    private ContactType contactType;
    private String name;

    private String phone;
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

    }

    @Override
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setEmail(String email) {

    }

    public ContactPhone getResult() {
        return new ContactPhone(contactType,name,phone);
    }
}
