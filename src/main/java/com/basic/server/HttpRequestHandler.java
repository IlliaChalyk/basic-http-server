package com.basic.server;

public abstract class HttpRequestHandler {
    public abstract void handle(HttpRequest request, HttpResponse response);
}
