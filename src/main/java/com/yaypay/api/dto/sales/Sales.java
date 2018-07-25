package com.yaypay.api.dto.sales;

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

public class Sales {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String mobile;

    private boolean deleted;

    @java.beans.ConstructorProperties({"firstName", "lastName", "email", "phone", "mobile", "deleted"})
    Sales(String firstName, String lastName, String email, String phone, String mobile, boolean deleted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.mobile = mobile;
        this.deleted = deleted;
    }

    public static SalesBuilder builder() {
        return new SalesBuilder();
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

    public String getMobile() {
        return this.mobile;
    }

    public boolean isDeleted() {
        return this.deleted;
    }

    public static class SalesBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        private String mobile;
        private boolean deleted;

        SalesBuilder() {
        }

        public Sales.SalesBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Sales.SalesBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Sales.SalesBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Sales.SalesBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Sales.SalesBuilder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Sales.SalesBuilder deleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public Sales build() {
            return new Sales(firstName, lastName, email, phone, mobile, deleted);
        }

        public String toString() {
            return "Sales.SalesBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", phone=" + this.phone + ", mobile=" + this.mobile + ", deleted=" + this.deleted + ")";
        }
    }
}
