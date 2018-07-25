package com.yaypay.api.dto.external_company;

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

public class ExternalCompanyResponse {

    private ExternalCompany externalCompany;

    private Long id;

    private String createTime;

    private String updateTime;

    private Integration integration;

    @java.beans.ConstructorProperties({"externalCompany", "id", "createTime", "updateTime", "integration"})
    ExternalCompanyResponse(ExternalCompany externalCompany, Long id, String createTime, String updateTime, Integration integration) {
        this.externalCompany = externalCompany;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static ExternalCompanyResponseBuilder builder() {
        return new ExternalCompanyResponseBuilder();
    }

    public ExternalCompany getExternalCompany() {
        return this.externalCompany;
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

    public static class ExternalCompanyResponseBuilder {
        private ExternalCompany externalCompany;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        ExternalCompanyResponseBuilder() {
        }

        public ExternalCompanyResponse.ExternalCompanyResponseBuilder externalCompany(ExternalCompany externalCompany) {
            this.externalCompany = externalCompany;
            return this;
        }

        public ExternalCompanyResponse.ExternalCompanyResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ExternalCompanyResponse.ExternalCompanyResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public ExternalCompanyResponse.ExternalCompanyResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ExternalCompanyResponse.ExternalCompanyResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ExternalCompanyResponse build() {
            return new ExternalCompanyResponse(externalCompany, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "ExternalCompanyResponse.ExternalCompanyResponseBuilder(externalCompany=" + this.externalCompany + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
