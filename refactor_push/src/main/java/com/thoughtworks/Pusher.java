package com.thoughtworks;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

import java.util.Queue;

import static java.lang.Thread.sleep;

class Pusher {
    private Queue<String> queue;
    private HttpClient httpclient;

    public Pusher(Queue<String> queue, HttpClient httpClient) {
        this.httpclient = httpClient;
        this.queue = queue;
    }

    public void run() {
        String json = queue.poll();
        if (json == null || json.length() <= 0) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return;
        }
        HttpPost post = new HttpPost("https://android.googleapis.com/gcm/send");
        post.setHeader("Authorization", "key=AIzaSyCABSTd47XeIH");
        post.setHeader("Content-Type", "application/json");
        System.out.println("posting " + json);
        try {
            HttpEntity entity = new StringEntity(json);
            post.setEntity(entity);
            httpclient.execute(post);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}