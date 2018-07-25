package com.yaypay.api.dto.invoice;

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
public class InvoiceResponse {

  private Invoice invoice;

  private Long id;

  private String createTime;

  private String updateTime;

  private Integration integration;

    @java.beans.ConstructorProperties({"invoice", "id", "createTime", "updateTime", "integration"})
    InvoiceResponse(Invoice invoice, Long id, String createTime, String updateTime, Integration integration) {
        this.invoice = invoice;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static InvoiceResponseBuilder builder() {
        return new InvoiceResponseBuilder();
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    public Long getId() {
        return this.id;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class InvoiceResponseBuilder {
        private Invoice invoice;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        InvoiceResponseBuilder() {
        }

        public InvoiceResponse.InvoiceResponseBuilder invoice(Invoice invoice) {
            this.invoice = invoice;
            return this;
        }

        public InvoiceResponse.InvoiceResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public InvoiceResponse.InvoiceResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public InvoiceResponse.InvoiceResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public InvoiceResponse.InvoiceResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public InvoiceResponse build() {
            return new InvoiceResponse(invoice, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "InvoiceResponse.InvoiceResponseBuilder(invoice=" + this.invoice + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
