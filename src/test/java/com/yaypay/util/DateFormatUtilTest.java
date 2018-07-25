package com.yaypay.util;

import org.junit.Test;

import java.util.Date;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class DateFormatUtilTest {

    @Test
    public void dateToIso8601UtcString() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        Date date = new Date(70, 0, 1);
        String string = DateFormatUtil.dateToIso8601UtcString(date);
        assertNotNull(string);
        assertEquals("1970-01-01T00:00:00+00:00", string);
    }

    @Test
    public void testNull() {
        assertNull(DateFormatUtil.dateToIso8601UtcString(null));
    }
}