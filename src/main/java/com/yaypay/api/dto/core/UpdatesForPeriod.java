package com.yaypay.api.dto.core;

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
public class UpdatesForPeriod {
    private String dateFrom;
    private String dateTo;
    private String sourceSystem;

    @java.beans.ConstructorProperties({"dateFrom", "dateTo", "sourceSystem"})
    UpdatesForPeriod(String dateFrom, String dateTo, String sourceSystem) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.sourceSystem = sourceSystem;
    }

    public static UpdatesForPeriodBuilder builder() {
        return new UpdatesForPeriodBuilder();
    }

    public String getDateFrom() {
        return this.dateFrom;
    }

    public String getDateTo() {
        return this.dateTo;
    }

    public String getSourceSystem() {
        return this.sourceSystem;
    }

    public static class UpdatesForPeriodBuilder {
        private String dateFrom;
        private String dateTo;
        private String sourceSystem;

        UpdatesForPeriodBuilder() {
        }

        public UpdatesForPeriod.UpdatesForPeriodBuilder dateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }

        public UpdatesForPeriod.UpdatesForPeriodBuilder dateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }

        public UpdatesForPeriod.UpdatesForPeriodBuilder sourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }

        public UpdatesForPeriod build() {
            return new UpdatesForPeriod(dateFrom, dateTo, sourceSystem);
        }

        public String toString() {
            return "UpdatesForPeriod.UpdatesForPeriodBuilder(dateFrom=" + this.dateFrom + ", dateTo=" + this.dateTo + ", sourceSystem=" + this.sourceSystem + ")";
        }
    }
}
