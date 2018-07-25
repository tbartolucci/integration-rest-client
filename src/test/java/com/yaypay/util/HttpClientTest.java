package com.yaypay.util;

import com.yaypay.exception.HttpClientCallException;
import com.yaypay.exception.HttpClientNotSuccessStatusException;
import com.yaypay.integration.service.httpclient.HttpClient;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HttpClientTest {
    private static final String DOLLAR_IDENTIFIER = "840";
    private HttpClient httpClient = new HttpClient();

    @Test
    public void get() {
        NBUCrossRate[] response = httpClient.get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json", NBUCrossRate[].class);

        assertNotNull(response);
        NBUCrossRate dollarCrossRate = Arrays.stream(response).filter(r -> DOLLAR_IDENTIFIER.equalsIgnoreCase(r.getR030())).findFirst().orElse(null);
        assertNotNull(dollarCrossRate);
    }

    @Test(expected = HttpClientCallException.class)
    public void getException() {
        httpClient.get("http://" + UUID.randomUUID().toString() + ".com", String.class);
    }

    @Test
    public void post() {
        TestBody body = new TestBody();
        String someText = ":this is test text";
        body.setSomeText(someText);
        TestBody post = httpClient.post("https://jsonplaceholder.typicode.com/posts", body, TestBody.class);
        assertNotNull(post);
        assertEquals(someText, post.getSomeText());
    }

    @Test(expected = HttpClientNotSuccessStatusException.class)
    public void postWithException() {
        Map<String, String> body = Collections.singletonMap("email", "sydney@fife");
        TestBody post = httpClient.post("https://reqres.in/api/register", body, TestBody.class);
    }

    @Test
    public void put() {
        TestBody body = new TestBody();
        String someText = ":this is test text";
        body.setSomeText(someText);
        TestBody post = httpClient.put("https://jsonplaceholder.typicode.com/posts/1", body, TestBody.class);
        assertNotNull(post);
        assertEquals("1", post.getId());
        assertEquals(someText, post.getSomeText());
    }

    @Test
    public void delete() {
        httpClient.delete("https://jsonplaceholder.typicode.com/posts/1");
    }

    @Test
    public void getWithHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("api", "key");
        NBUCrossRate[] response = httpClient.get("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json", NBUCrossRate[].class, headers);

        assertNotNull(response);
        NBUCrossRate dollarCrossRate = Arrays.stream(response).filter(r -> DOLLAR_IDENTIFIER.equalsIgnoreCase(r.getR030())).findFirst().orElse(null);
        assertNotNull(dollarCrossRate);
    }
}