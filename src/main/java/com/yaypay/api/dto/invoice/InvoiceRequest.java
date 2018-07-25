package com.yaypay.api.dto.invoice;

import com.yaypay.api.dto.core.EntityRequest;
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
public class InvoiceRequest extends EntityRequest {
    private Invoice invoice;
    private Integration integration;

    @java.beans.ConstructorProperties({"invoice", "integration"})
    private InvoiceRequest(Invoice invoice, Integration integration) {
        this.invoice = invoice;
        this.integration = integration;
    }

    public InvoiceRequest() {
    }

    public static InvoiceRequest of(Invoice invoice, Integration integration) {
        return new InvoiceRequest(invoice, integration);
    }

    public static InvoiceRequestBuilder builder() {
        return new InvoiceRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return invoice;
    }

    public Invoice getInvoice() {
        return this.invoice;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class InvoiceRequestBuilder {
        private Invoice invoice;
        private Integration integration;

        InvoiceRequestBuilder() {
        }

        public InvoiceRequest.InvoiceRequestBuilder invoice(Invoice invoice) {
            this.invoice = invoice;
            return this;
        }

        public InvoiceRequest.InvoiceRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public InvoiceRequest build() {
            return new InvoiceRequest(invoice, integration);
        }

        public String toString() {
            return "InvoiceRequest.InvoiceRequestBuilder(invoice=" + this.invoice + ", integration=" + this.integration + ")";
        }
    }
}
