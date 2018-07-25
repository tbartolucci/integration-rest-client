package com.yaypay.api.dto;

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

public class ConnectionInfo {
    private Integer bizId;
    private String lastSyncDate;

    public Integer getBizId() {
        return this.bizId;
    }

    public String getLastSyncDate() {
        return this.lastSyncDate;
    }

    public ConnectionInfo setBizId(Integer bizId) {
        this.bizId = bizId;
        return this;
    }

    public ConnectionInfo setLastSyncDate(String lastSyncDate) {
        this.lastSyncDate = lastSyncDate;
        return this;
    }
}
