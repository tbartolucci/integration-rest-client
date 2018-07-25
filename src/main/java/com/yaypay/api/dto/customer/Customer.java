package com.yaypay.api.dto.customer;

import com.yaypay.api.dto.address.Address;

import java.math.BigDecimal;
import java.util.Map;

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
public class Customer {
    private String status;
    private String companyName;
    private Address address;
    private BigDecimal creditLimit;
    private String parentId;
    private BigDecimal balance;
    private String currency;
    private Map<String, Object> customFields;
    private String dunsNumber;
    private String taxId;

    @java.beans.ConstructorProperties({"status", "companyName", "address", "creditLimit", "parentId", "balance", "currency", "customFields", "dunsNumber", "taxId"})
    Customer(String status, String companyName, Address address, BigDecimal creditLimit, String parentId, BigDecimal balance, String currency, Map<String, Object> customFields, String dunsNumber, String taxId) {
        this.status = status;
        this.companyName = companyName;
        this.address = address;
        this.creditLimit = creditLimit;
        this.parentId = parentId;
        this.balance = balance;
        this.currency = currency;
        this.customFields = customFields;
        this.dunsNumber = dunsNumber;
        this.taxId = taxId;
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    public String getStatus() {
        return this.status;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public Address getAddress() {
        return this.address;
    }

    public BigDecimal getCreditLimit() {
        return this.creditLimit;
    }

    public String getParentId() {
        return this.parentId;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Map<String, Object> getCustomFields() {
        return this.customFields;
    }

    public String getDunsNumber() {
        return this.dunsNumber;
    }

    public String getTaxId() {
        return this.taxId;
    }

    public static class CustomerBuilder {
        private String status;
        private String companyName;
        private Address address;
        private BigDecimal creditLimit;
        private String parentId;
        private BigDecimal balance;
        private String currency;
        private Map<String, Object> customFields;
        private String dunsNumber;
        private String taxId;

        CustomerBuilder() {
        }

        public Customer.CustomerBuilder status(String status) {
            this.status = status;
            return this;
        }

        public Customer.CustomerBuilder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Customer.CustomerBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public Customer.CustomerBuilder creditLimit(BigDecimal creditLimit) {
            this.creditLimit = creditLimit;
            return this;
        }

        public Customer.CustomerBuilder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        public Customer.CustomerBuilder balance(BigDecimal balance) {
            this.balance = balance;
            return this;
        }

        public Customer.CustomerBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Customer.CustomerBuilder customFields(Map<String, Object> customFields) {
            this.customFields = customFields;
            return this;
        }

        public Customer.CustomerBuilder dunsNumber(String dunsNumber) {
            this.dunsNumber = dunsNumber;
            return this;
        }

        public Customer.CustomerBuilder taxId(String taxId) {
            this.taxId = taxId;
            return this;
        }

        public Customer build() {
            return new Customer(status, companyName, address, creditLimit, parentId, balance, currency, customFields, dunsNumber, taxId);
        }

        public String toString() {
            return "Customer.CustomerBuilder(status=" + this.status + ", companyName=" + this.companyName + ", address=" + this.address + ", creditLimit=" + this.creditLimit + ", parentId=" + this.parentId + ", balance=" + this.balance + ", currency=" + this.currency + ", customFields=" + this.customFields + ", dunsNumber=" + this.dunsNumber + ", taxId=" + this.taxId + ")";
        }
    }
}
