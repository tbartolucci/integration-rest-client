package com.yaypay.api.dto.contact;

import com.yaypay.api.dto.core.Integration;

/*************************************************************************
 * * Yaypay CONFIDENTIAL   2018
 * * All Rights Reserved. * *
 * NOTICE: All information contained herein is, and remains the property of Yaypay Incorporated and its suppliers, if any.
 * The intellectual and technical concepts contained  herein are proprietary to Yaypay Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material  is strictly forbidden unless prior written permission is obtained  from Yaypay Incorporated.
 * Author : AKuzovchikov
 * Date Created: 7/25/2018 17:49
 */
public class Contact {
    private Integer contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String mobilePhone;
    private boolean autoCreated;
    private boolean primary;
    private Integration customer;

    @java.beans.ConstructorProperties({"contactId", "firstName", "lastName", "email", "phone", "mobilePhone", "autoCreated", "primary", "customer"})
    Contact(Integer contactId, String firstName, String lastName, String email, String phone, String mobilePhone, boolean autoCreated, boolean primary, Integration customer) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.mobilePhone = mobilePhone;
        this.autoCreated = autoCreated;
        this.primary = primary;
        this.customer = customer;
    }

    public static ContactBuilder builder() {
        return new ContactBuilder();
    }

    public Integer getContactId() {
        return this.contactId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public boolean isAutoCreated() {
        return this.autoCreated;
    }

    public boolean isPrimary() {
        return this.primary;
    }

    public Integration getCustomer() {
        return this.customer;
    }

    public static class ContactBuilder {
        private Integer contactId;
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String mobilePhone;
        private boolean autoCreated;
        private boolean primary;
        private Integration customer;

        ContactBuilder() {
        }

        public Contact.ContactBuilder contactId(Integer contactId) {
            this.contactId = contactId;
            return this;
        }

        public Contact.ContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Contact.ContactBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Contact.ContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Contact.ContactBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Contact.ContactBuilder mobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public Contact.ContactBuilder autoCreated(boolean autoCreated) {
            this.autoCreated = autoCreated;
            return this;
        }

        public Contact.ContactBuilder primary(boolean primary) {
            this.primary = primary;
            return this;
        }

        public Contact.ContactBuilder customer(Integration customer) {
            this.customer = customer;
            return this;
        }

        public Contact build() {
            return new Contact(contactId, firstName, lastName, email, phone, mobilePhone, autoCreated, primary, customer);
        }

        public String toString() {
            return "Contact.ContactBuilder(contactId=" + this.contactId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phone=" + this.phone + ", mobilePhone=" + this.mobilePhone + ", autoCreated=" + this.autoCreated + ", primary=" + this.primary + ", customer=" + this.customer + ")";
        }
    }
}
