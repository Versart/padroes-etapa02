package com.ifma.questao1;

public class ContactInternetBuilder implements Builder{
    private ContactType contactType;

    private String name;

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

    }

    @Override
    public void setPhone(String phone) {

    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    public ContactInternet getResult() {
        return new ContactInternet(contactType,name,email);
    }
}
