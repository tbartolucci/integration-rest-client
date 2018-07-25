package com.yaypay.api.dto.contact;

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
public class ContactResponse {
    private Contact contact;

    private Long id;

    private String createTime;

    private String updateTime;

    private boolean autoCreated;

    private Integration integration;

    @java.beans.ConstructorProperties({"contact", "id", "createTime", "updateTime", "autoCreated", "integration"})
    ContactResponse(Contact contact, Long id, String createTime, String updateTime, boolean autoCreated, Integration integration) {
        this.contact = contact;
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.autoCreated = autoCreated;
        this.integration = integration;
    }

    public static ContactResponseBuilder builder() {
        return new ContactResponseBuilder();
    }

    public Contact getContact() {
        return this.contact;
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

    public boolean isAutoCreated() {
        return this.autoCreated;
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public static class ContactResponseBuilder {
        private Contact contact;
        private Long id;
        private String createTime;
        private String updateTime;
        private boolean autoCreated;
        private Integration integration;

        ContactResponseBuilder() {
        }

        public ContactResponse.ContactResponseBuilder contact(Contact contact) {
            this.contact = contact;
            return this;
        }

        public ContactResponse.ContactResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ContactResponse.ContactResponseBuilder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public ContactResponse.ContactResponseBuilder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public ContactResponse.ContactResponseBuilder autoCreated(boolean autoCreated) {
            this.autoCreated = autoCreated;
            return this;
        }

        public ContactResponse.ContactResponseBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public ContactResponse build() {
            return new ContactResponse(contact, id, createTime, updateTime, autoCreated, integration);
        }

        public String toString() {
            return "ContactResponse.ContactResponseBuilder(contact=" + this.contact + ", id=" + this.id + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", autoCreated=" + this.autoCreated + ", integration=" + this.integration + ")";
        }
    }
}
