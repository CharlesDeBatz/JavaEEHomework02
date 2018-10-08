package com.djlama.homework.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Order", urlPatterns = {"/order"})
public class Order extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Order</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Order</h1>");
            out.println("<ul>");
            out.println("<li><a href='main'>Main</a></li>");
            out.println("<li><a href='catalog'>Catalog</a></li>");
            out.println("<li><a href='cart'>Cart</a></li>");
            out.println("<li><a href='order'>Order</a></li>");
            out.println("<li><a href='product'>Product</a></li>");
            out.println("</ul>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
