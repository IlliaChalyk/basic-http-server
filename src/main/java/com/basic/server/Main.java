package com.basic.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;

public class Main {
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException {
        //This thing can read requests and send responses
        ServerSocket socket = new ServerSocket(8099);
        while (true) {
            Socket clientSocket = socket.accept();
            InputStream inputStream = clientSocket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            OutputStream outputStream = clientSocket.getOutputStream();
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));
            writer.write(
                    "HTTP/1.1 200 OK\n" +
                            "Content-Length: 14\n" +
                            "Content-Type: text/html\n" +
                            "\n" +
                            "<h1>Hello</h1>");
            writer.flush();
        }
    }
}
