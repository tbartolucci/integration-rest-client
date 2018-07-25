package com.yaypay.api.dto.sales;

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
public class SalesRequest extends EntityRequest {
    private Sales sales;
    private Integration integration;

    @java.beans.ConstructorProperties({"sales", "integration"})
    SalesRequest(Sales sales, Integration integration) {
        this.sales = sales;
        this.integration = integration;
    }

    public static SalesRequestBuilder builder() {
        return new SalesRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return sales;
    }

    public Sales getSales() {
        return this.sales;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class SalesRequestBuilder {
        private Sales sales;
        private Integration integration;

        SalesRequestBuilder() {
        }

        public SalesRequest.SalesRequestBuilder sales(Sales sales) {
            this.sales = sales;
            return this;
        }

        public SalesRequest.SalesRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public SalesRequest build() {
            return new SalesRequest(sales, integration);
        }

        public String toString() {
            return "SalesRequest.SalesRequestBuilder(sales=" + this.sales + ", integration=" + this.integration + ")";
        }
    }
}
