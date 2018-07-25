package com.yaypay.util;

import java.time.format.DateTimeFormatter;
import java.util.Date;

import static java.time.ZoneOffset.UTC;

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

public final class DateFormatUtil {
    private static final String ISO_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ssx':00'";

    private DateFormatUtil() {
    }

    public static String dateToIso8601UtcString(Date date) {
        if (date == null) {
            return null;
        }
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(ISO_DATE_TIME_FORMAT).withZone(UTC);
        return dateTimeFormatter.format(date.toInstant());
    }
}
