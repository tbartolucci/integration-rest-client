package com.yaypay.api.dto.core;

import com.yaypay.api.dto.log.SyncEntity;

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
public class DeleteEntity {
    private Integration integration;
    private SyncEntity entityType;

    @java.beans.ConstructorProperties({"integration", "entityType"})
    private DeleteEntity(Integration integration, SyncEntity entityType) {
        this.integration = integration;
        this.entityType = entityType;
    }

    public static DeleteEntity of(Integration integration, SyncEntity entityType) {
        return new DeleteEntity(integration, entityType);
    }

    public static DeleteEntityBuilder builder() {
        return new DeleteEntityBuilder();
    }

    public Integration getIntegration() {
        return this.integration;
    }

    public SyncEntity getEntityType() {
        return this.entityType;
    }

    public static class DeleteEntityBuilder {
        private Integration integration;
        private SyncEntity entityType;

        DeleteEntityBuilder() {
        }

        public DeleteEntity.DeleteEntityBuilder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        public DeleteEntity.DeleteEntityBuilder entityType(SyncEntity entityType) {
            this.entityType = entityType;
            return this;
        }

        public DeleteEntity build() {
            return new DeleteEntity(integration, entityType);
        }

        public String toString() {
            return "DeleteEntity.DeleteEntityBuilder(integration=" + this.integration + ", entityType=" + this.entityType + ")";
        }
    }
}