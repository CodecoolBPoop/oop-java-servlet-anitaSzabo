package com.codecool.servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cart", urlPatterns = {"/cart"}, loadOnStartup = 4)
public class ShoppingCartServlet extends HttpServlet {

    private int sumOfPrice = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < Itemstore.itemList.size(); i++) {
            buffer.append("<div>");
            buffer.append(Itemstore.itemList.get(i).getName() + " " +
                    Itemstore.itemList.get(i).getPrice());
            buffer.append("</a>");
            buffer.append("</div>");
            sumOfPrice += Itemstore.itemList.get(i).getPrice();
        }

        out.println(
                "<html>\n" +
                        "<head><title>Shopping Cart</title></head>\n" +
                        "<body>\n" +
                        "<h1>Shopping Cart</h1>" +
                        "<div>" + buffer.toString() + "</div>" +
                        "<div>Sum of Price: " + sumOfPrice + " HUF</div>" +
                        "</body></html>");
    }
}