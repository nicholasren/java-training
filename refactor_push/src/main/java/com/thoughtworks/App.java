package com.thoughtworks;

import org.apache.http.impl.client.HttpClients;

import java.net.SocketException;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class App {


    public static void main(String[] args) throws SocketException {

        Queue<String> queue = new LinkedBlockingQueue<>();


        Pusher pusher = new Pusher(queue, HttpClients.createDefault());

        Runnable client = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    pusher.run();
                }
            }
        };

        Thread t = new Thread(client);
        t.start();


        UDPServer server = new UDPServer(queue);

        while (true) {
            server.run();
        }
    }

}