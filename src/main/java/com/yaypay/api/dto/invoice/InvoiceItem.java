package com.yaypay.api.dto.invoice;

import com.yaypay.api.dto.core.Integration;

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
public class InvoiceItem {
    private String name;
    private String type;
    private String description;
    private BigDecimal quantity;
    private BigDecimal rate;
    private BigDecimal amount;
    private String employeeName;
    private String employeeId;
    private Map<String, Object> customFields;
    private Integration integration;

    @java.beans.ConstructorProperties({"name", "type", "description", "quantity", "rate", "amount", "employeeName", "employeeId", "customFields", "integration"})
    public InvoiceItem(String name, String type, String description, BigDecimal quantity, BigDecimal rate, BigDecimal amount, String employeeName, String employeeId, Map<String, Object> customFields, Integration integration) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.quantity = quantity;
        this.rate = rate;
        this.amount = amount;
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.customFields = customFields;
        this.integration = integration;
    }

    public static InvoiceItemBuilder builder() {
        return new InvoiceItemBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public BigDecimal getQuantity() {
        return this.quantity;
    }

    public BigDecimal getRate() {
        return this.rate;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Map<String, Object> getCustomFields() {
        return this.customFields;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public InvoiceItem setName(String name) {
        this.name = name;
        return this;
    }

    public InvoiceItem setType(String type) {
        this.type = type;
        return this;
    }

    public InvoiceItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public InvoiceItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }

    public InvoiceItem setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    public InvoiceItem setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public InvoiceItem setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
        return this;
    }

    public InvoiceItem setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }


    public InvoiceItem setCustomFields(Map<String, Object> customFields) {
        this.customFields = customFields;
        return this;
    }

    public InvoiceItem setIntegration(Integration integration) {
        this.integration = integration;
        return this;
    }

    public static class InvoiceItemBuilder {
        private String name;
        private String type;
        private String description;
        private BigDecimal quantity;
        private BigDecimal rate;
        private BigDecimal amount;
        private String employeeName;
        private String employeeId;
        private Map<String, Object> customFields;
        private Integration integration;

        InvoiceItemBuilder() {
        }

        public InvoiceItem.InvoiceItemBuilder name(String name) {
            this.name = name;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder type(String type) {
            this.type = type;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder description(String description) {
            this.description = description;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder quantity(BigDecimal quantity) {
            this.quantity = quantity;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder rate(BigDecimal rate) {
            this.rate = rate;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder employeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder employeeId(String employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder customFields(Map<String, Object> customFields) {
            this.customFields = customFields;
            return this;
        }

        public InvoiceItem.InvoiceItemBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public InvoiceItem build() {
            return new InvoiceItem(name, type, description, quantity, rate, amount, employeeName, employeeId, customFields, integration);
        }

        public String toString() {
            return "InvoiceItem.InvoiceItemBuilder(name=" + this.name + ", type=" + this.type + ", description=" + this.description + ", quantity=" + this.quantity + ", rate=" + this.rate + ", amount=" + this.amount + ", employeeName=" + this.employeeName +  ", employeeId=" + this.employeeId + ", customFields=" + this.customFields + ", integration=" + this.integration + ")";
        }
    }
}
