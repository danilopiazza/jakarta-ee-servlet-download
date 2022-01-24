package io.github.danilopiazza.jakarta.servlet;

import java.io.BufferedOutputStream;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/zero")
public class ZeroServlet extends HttpServlet {
    private static final int BUFFER_SIZE = 8192;

    @Override
    @SuppressWarnings("java:S2189")
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        byte[] buffer = new byte[BUFFER_SIZE];
        while (true) {
            out.write(buffer);
        }
    }
}
