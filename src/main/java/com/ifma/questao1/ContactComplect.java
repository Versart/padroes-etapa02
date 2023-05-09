package com.ifma.questao1;

public class ContactComplect {
    private ContactType contactType;
    private String name;
    private String address;
    private String phone;
    private String email;

    public ContactComplect(ContactType contactType, String name, String address, String phone, String email) {
        this.contactType = contactType;
        this.name = name;
        this.address = address;
        this.phone = phone;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactComplect{" +
                "contactType=" + contactType +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
