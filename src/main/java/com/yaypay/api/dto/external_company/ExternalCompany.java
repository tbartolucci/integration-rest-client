package com.yaypay.api.dto.external_company;

import com.yaypay.api.dto.core.Integration;

import java.util.Map;

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

public class ExternalCompany {
    private String name;
    private Integration userOwner;
    private Map<String, Object> customFields;

    @java.beans.ConstructorProperties({"name", "userOwner", "customFields"})
    ExternalCompany(String name, Integration userOwner, Map<String, Object> customFields) {
        this.name = name;
        this.userOwner = userOwner;
        this.customFields = customFields;
    }

    public static ExternalCompanyBuilder builder() {
        return new ExternalCompanyBuilder();
    }

    public String getName() {
        return this.name;
    }

    public Integration getUserOwner() {
        return this.userOwner;
    }

    public Map<String, Object> getCustomFields() {
        return this.customFields;
    }

    public static class ExternalCompanyBuilder {
        private String name;
        private Integration userOwner;
        private Map<String, Object> customFields;

        ExternalCompanyBuilder() {
        }

        public ExternalCompany.ExternalCompanyBuilder name(String name) {
            this.name = name;
            return this;
        }

        public ExternalCompany.ExternalCompanyBuilder userOwner(Integration userOwner) {
            this.userOwner = userOwner;
            return this;
        }

        public ExternalCompany.ExternalCompanyBuilder customFields(Map<String, Object> customFields) {
            this.customFields = customFields;
            return this;
        }

        public ExternalCompany build() {
            return new ExternalCompany(name, userOwner, customFields);
        }

        public String toString() {
            return "ExternalCompany.ExternalCompanyBuilder(name=" + this.name + ", userOwner=" + this.userOwner + ", customFields=" + this.customFields + ")";
        }
    }
}
