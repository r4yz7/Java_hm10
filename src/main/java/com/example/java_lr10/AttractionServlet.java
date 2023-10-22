package com.example.java_lr10;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "cityAttraction", value = "/cityAttraction")
public class AttractionServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String massGrave = "Братська могила «Скорботна мати»";
        String img1 = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2f/%D0%91%D1%80%D0%B0%D1%82%D1%81%D1%8C%D0%BA%D0%B0_%D0%BC%D0%BE%D0%B3%D0%B8%D0%BB%D0%B0_%C2%AB%D0%A1%D0%BA%D0%BE%D1%80%D0%B1%D0%BE%D1%82%D0%BD%D0%B0_%D0%BC%D0%B0%D1%82%D0%B8%C2%BB_04.jpg/220px-%D0%91%D1%80%D0%B0%D1%82%D1%81%D1%8C%D0%BA%D0%B0_%D0%BC%D0%BE%D0%B3%D0%B8%D0%BB%D0%B0_%C2%AB%D0%A1%D0%BA%D0%BE%D1%80%D0%B1%D0%BE%D1%82%D0%BD%D0%B0_%D0%BC%D0%B0%D1%82%D0%B8%C2%BB_04.jpg";
        String warrior = "Братська могила 68 воїнів";
        String img2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/%D0%91%D1%80%D0%B0%D1%82%D1%81%D1%8C%D0%BA%D0%B0_%D0%BC%D0%BE%D0%B3%D0%B8%D0%BB%D0%B0%2C_%D0%B2_%D1%8F%D0%BA%D1%96%D0%B9_%D0%BF%D0%BE%D1%85%D0%BE%D0%B2%D0%B0%D0%BD%D0%BE_68_%D0%B2%D0%BE%D1%97%D0%BD%D1%96%D0%B2%2C_%D1%84%D0%BE%D1%82%D0%BE_4.jpg/300px-%D0%91%D1%80%D0%B0%D1%82%D1%81%D1%8C%D0%BA%D0%B0_%D0%BC%D0%BE%D0%B3%D0%B8%D0%BB%D0%B0%2C_%D0%B2_%D1%8F%D0%BA%D1%96%D0%B9_%D0%BF%D0%BE%D1%85%D0%BE%D0%B2%D0%B0%D0%BD%D0%BE_68_%D0%B2%D0%BE%D1%97%D0%BD%D1%96%D0%B2%2C_%D1%84%D0%BE%D1%82%D0%BE_4.jpg";
        String volodymyr = "Пам'ятник Володимиру Великому";
        String img3 = "https://upload.wikimedia.org/wikipedia/uk/thumb/0/0d/%D0%9A%D1%80%D0%B8%D0%B2%D0%B8%D0%B9_%D0%A0%D1%96%D0%B3%2C_%D0%BF%D0%B0%D0%BC%27%D1%8F%D1%82%D0%BD%D0%B8%D0%BA_%D0%92%D0%BE%D0%BB%D0%BE%D0%B4%D0%B8%D0%BC%D0%B8%D1%80%D1%83_%D0%92%D0%B5%D0%BB%D0%B8%D0%BA%D0%BE%D0%BC%D1%83.jpg/250px-%D0%9A%D1%80%D0%B8%D0%B2%D0%B8%D0%B9_%D0%A0%D1%96%D0%B3%2C_%D0%BF%D0%B0%D0%BC%27%D1%8F%D1%82%D0%BD%D0%B8%D0%BA_%D0%92%D0%BE%D0%BB%D0%BE%D0%B4%D0%B8%D0%BC%D0%B8%D1%80%D1%83_%D0%92%D0%B5%D0%BB%D0%B8%D0%BA%D0%BE%D0%BC%D1%83.jpg";
        request.setAttribute("massGrave", massGrave);
        request.setAttribute("img1", img1);
        request.setAttribute("warrior", warrior);
        request.setAttribute("img2", img2);
        request.setAttribute("volodymyr", volodymyr);
        request.setAttribute("img3", img3);
        request.getRequestDispatcher("/cityAttraction.jsp").forward(request,response);
    }

    public void destroy() {
    }
}