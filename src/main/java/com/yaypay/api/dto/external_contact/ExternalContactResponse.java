package com.yaypay.api.dto.external_contact;

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

public class ExternalContactResponse {

    private ExternalContact externalContact;

    private Long id;

    private String createTime;

    private String updateTime;

    private Integration integration;

    @java.beans.ConstructorProperties({"externalContact", "id", "createTime", "updateTime", "integration"})
    ExternalContactResponse(ExternalContact externalContact, Long id, String createTime, String updateTime, Integration integration) {
        this.externalContact = externalContact;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.integration = integration;
    }

    public static ExternalContactResponseBuilder builder() {
        return new ExternalContactResponseBuilder();
    }

    public ExternalContact getExternalContact() {
        return this.externalContact;
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

    public static class ExternalContactResponseBuilder {
        private ExternalContact externalContact;
        private Long id;
        private String createTime;
        private String updateTime;
        private Integration integration;

        ExternalContactResponseBuilder() {
        }

        public ExternalContactResponse.ExternalContactResponseBuilder externalContact(ExternalContact externalContact) {
            this.externalContact = externalContact;
            return this;
        }

        public ExternalContactResponse.ExternalContactResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ExternalContactResponse.ExternalContactResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public ExternalContactResponse.ExternalContactResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ExternalContactResponse.ExternalContactResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ExternalContactResponse build() {
            return new ExternalContactResponse(externalContact, id, createTime, updateTime, integration);
        }

        public String toString() {
            return "ExternalContactResponse.ExternalContactResponseBuilder(externalContact=" + this.externalContact + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", integration=" + this.integration + ")";
        }
    }
}
