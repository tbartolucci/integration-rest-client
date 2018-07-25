package com.yaypay.api.dto.creditmemo;

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
public class CreditMemoResponse {

    private CreditMemo creditMemo;

    private Long id;

    private String createTime;

    private String updateTime;

    private Integration integration;

    @java.beans.ConstructorProperties({"creditMemo", "id", "createTime", "updateTime", "integration"})
    CreditMemoResponse(CreditMemo creditMemo, Long id, String createTime, String updateTime, Integration integration) {
        this.creditMemo = creditMemo;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static CreditMemoResponseBuilder builder() {
        return new CreditMemoResponseBuilder();
    }

    public CreditMemo getCreditMemo() {
        return this.creditMemo;
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

    public static class CreditMemoResponseBuilder {
        private CreditMemo creditMemo;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        CreditMemoResponseBuilder() {
        }

        public CreditMemoResponse.CreditMemoResponseBuilder creditMemo(CreditMemo creditMemo) {
            this.creditMemo = creditMemo;
            return this;
        }

        public CreditMemoResponse.CreditMemoResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public CreditMemoResponse.CreditMemoResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public CreditMemoResponse.CreditMemoResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public CreditMemoResponse.CreditMemoResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public CreditMemoResponse build() {
            return new CreditMemoResponse(creditMemo, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "CreditMemoResponse.CreditMemoResponseBuilder(creditMemo=" + this.creditMemo + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
