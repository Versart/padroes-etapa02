package com.ifma.questao1;

public class ContactPhone {
    private ContactType contactType;

    private String name;

    private String phone;

    public ContactPhone(ContactType contactType, String name, String phone) {
        this.contactType = contactType;
        this.name = name;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactPhone{" +
                "contactType=" + contactType +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
