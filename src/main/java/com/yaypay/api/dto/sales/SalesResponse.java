package com.yaypay.api.dto.sales;

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

public class SalesResponse {

    private Sales sales;

    private Long id;

    private String createTime;

    private String updateTime;

    private Integration integration;

    @java.beans.ConstructorProperties({"sales", "id", "createTime", "updateTime", "integration"})
    SalesResponse(Sales sales, Long id, String createTime, String updateTime, Integration integration) {
        this.sales = sales;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static SalesResponseBuilder builder() {
        return new SalesResponseBuilder();
    }

    public Sales getSales() {
        return this.sales;
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

    public static class SalesResponseBuilder {
        private Sales sales;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        SalesResponseBuilder() {
        }

        public SalesResponse.SalesResponseBuilder sales(Sales sales) {
            this.sales = sales;
            return this;
        }

        public SalesResponse.SalesResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public SalesResponse.SalesResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public SalesResponse.SalesResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public SalesResponse.SalesResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public SalesResponse build() {
            return new SalesResponse(sales, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "SalesResponse.SalesResponseBuilder(sales=" + this.sales + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
