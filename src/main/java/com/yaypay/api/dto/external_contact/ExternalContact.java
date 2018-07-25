package com.yaypay.api.dto.external_contact;

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

public class ExternalContact {
    private String firstName;
    private String lastName;
    private String title;
    private String email;
    private String phone;
    private String fax;
    private String mobile;
    private Integration externalCompany;

    @java.beans.ConstructorProperties({"firstName", "lastName", "title", "email", "phone", "fax", "mobile", "externalCompany"})
    ExternalContact(String firstName, String lastName, String title, String email, String phone, String fax, String mobile, Integration externalCompany) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.email = email;
        this.phone = phone;
        this.fax = fax;
        this.mobile = mobile;
        this.externalCompany = externalCompany;
    }

    public static ExternalContactBuilder builder() {
        return new ExternalContactBuilder();
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getTitle() {
        return this.title;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getFax() {
        return this.fax;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Integration getExternalCompany() {
        return this.externalCompany;
    }

    public static class ExternalContactBuilder {
        private String firstName;
        private String lastName;
        private String title;
        private String email;
        private String phone;
        private String fax;
        private String mobile;
        private Integration externalCompany;

        ExternalContactBuilder() {
        }

        public ExternalContact.ExternalContactBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ExternalContact.ExternalContactBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ExternalContact.ExternalContactBuilder title(String title) {
            this.title = title;
            return this;
        }

        public ExternalContact.ExternalContactBuilder email(String email) {
            this.email = email;
            return this;
        }

        public ExternalContact.ExternalContactBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public ExternalContact.ExternalContactBuilder fax(String fax) {
            this.fax = fax;
            return this;
        }

        public ExternalContact.ExternalContactBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public ExternalContact.ExternalContactBuilder externalCompany(Integration externalCompany) {
            this.externalCompany = externalCompany;
            return this;
        }

        public ExternalContact build() {
            return new ExternalContact(firstName, lastName, title, email, phone, fax, mobile, externalCompany);
        }

        public String toString() {
            return "ExternalContact.ExternalContactBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", title=" + this.title + ", email=" + this.email + ", phone=" + this.phone + ", fax=" + this.fax + ", mobile=" + this.mobile + ", externalCompany=" + this.externalCompany + ")";
        }
    }
}
