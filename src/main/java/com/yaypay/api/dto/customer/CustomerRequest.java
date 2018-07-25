package com.yaypay.api.dto.customer;

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
public class CustomerRequest extends EntityRequest {
    private Customer customer;
    private Integration integration;

    @java.beans.ConstructorProperties({"customer", "integration"})
    CustomerRequest(Customer customer, Integration integration) {
        this.customer = customer;
        this.integration = integration;
    }

    public static CustomerRequestBuilder builder() {
        return new CustomerRequestBuilder();
    }

    @Override
    public Object getEntity() {
        return customer;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class CustomerRequestBuilder {
        private Customer customer;
        private Integration integration;

        CustomerRequestBuilder() {
        }

        public CustomerRequest.CustomerRequestBuilder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public CustomerRequest.CustomerRequestBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public CustomerRequest build() {
            return new CustomerRequest(customer, integration);
        }

        public String toString() {
            return "CustomerRequest.CustomerRequestBuilder(customer=" + this.customer + ", integration=" + this.integration + ")";
        }
    }
}
