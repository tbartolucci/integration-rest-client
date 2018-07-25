package com.yaypay.api.dto.customer;

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
public class CustomerResponse {

  private Customer customer;

  private Long id;

  private String createTime;

  private String updateTime;

  private Integration integration;

    @java.beans.ConstructorProperties({"customer", "id", "createTime", "updateTime", "integration"})
    CustomerResponse(Customer customer, Long id, String createTime, String updateTime, Integration integration) {
        this.customer = customer;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static CustomerResponseBuilder builder() {
        return new CustomerResponseBuilder();
    }

    public Customer getCustomer() {
        return this.customer;
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

    public static class CustomerResponseBuilder {
        private Customer customer;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        CustomerResponseBuilder() {
        }

        public CustomerResponse.CustomerResponseBuilder customer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public CustomerResponse.CustomerResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CustomerResponse.CustomerResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public CustomerResponse.CustomerResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public CustomerResponse.CustomerResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public CustomerResponse build() {
            return new CustomerResponse(customer, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "CustomerResponse.CustomerResponseBuilder(customer=" + this.customer + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
