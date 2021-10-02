package com.basic.server;

import java.io.IOException;

public interface HttpServer {
    void serve() throws IOException;

    void stop();
}
