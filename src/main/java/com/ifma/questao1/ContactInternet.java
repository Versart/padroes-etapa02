package com.ifma.questao1;

public class ContactInternet {

    private ContactType contactType;

    private String name;

    private String email;

    public ContactInternet(ContactType contactType, String name, String email) {
        this.contactType = contactType;
        this.name = name;
        this.email = email;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInternet{" +
                "contactType=" + contactType +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
