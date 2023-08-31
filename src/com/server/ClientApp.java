package com.server;

public class ClientApp {

    public static void main(String[] args) {
        String serverHost = "127.0.0.1";
        int serverPort = 5000;

        // Create multiple client instances in parallel
        for (int i = 1; i <= 10; i++) {
            String clientName = "Client " + i;
            Runnable clientRunnable = () -> {
                Client client = new Client(serverHost, serverPort);
                client.connect();
                client.initGUI(clientName);
            };
            new Thread(clientRunnable).start();
        }
    }
}
