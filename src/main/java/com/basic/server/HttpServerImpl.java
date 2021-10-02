package com.basic.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class HttpServerImpl implements HttpServer {
    private int port;
    private ServerSocket serverSocket;
    private List<HttpRequestHandler> handlers;
    private boolean on;

    public HttpServerImpl(int port) throws IOException {
        this.port = port;
        serverSocket = new ServerSocket(port);
    }

    @Override
    public void serve(){
        try {
            while (isOn()){
                Socket client = serverSocket.accept();

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void stop() {

    }

    public boolean isOn() {
        return on;
    }
}
