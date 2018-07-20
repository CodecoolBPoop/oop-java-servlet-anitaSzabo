package com.codecool.servlet;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet(name = "webshop", urlPatterns = {"/webshop"}, loadOnStartup = 3)
public class WebShopServlet extends HttpServlet {

    public void init() {
        Itemstore.itemList.add(new Item("Clariti 30 pcs", 6490f));
        Itemstore.itemList.add(new Item("Biofinity 6 pcs", 6490f));
        Itemstore.itemList.add(new Item("Air Optix Aqua 6 pcs", 6490f));
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < Itemstore.itemList.size(); i++) {
            buffer.append("<div>");
            buffer.append(Itemstore.itemList.get(i).getName() + " " +
                    Itemstore.itemList.get(i).getPrice() + "<a href=\"/add\">Add</a>" + "<a href=\"/remove\">Remove</a>");
            buffer.append("</a>");
            buffer.append("</div>");
        }

        out.println(
                "<html>\n" +
                        "<head><title>Webshop</title></head>\n" +
                        "<body>\n" +
                        "<h1>Webshop</h1>" +
                        "<div>" + buffer.toString() + "</div>" +
                        "</body></html>");
    }
}