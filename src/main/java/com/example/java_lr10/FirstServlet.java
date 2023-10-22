package com.example.java_lr10;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "cityInfo", value = "/cityInfo")
public class FirstServlet extends HttpServlet {

    public void init() {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        City city = new City("Kriviy Rih","Ukraine", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/Coat_of_Arms_of_Kryvyi_Rih.svg/200px-Coat_of_Arms_of_Kryvyi_Rih.svg.png",646748,"Криво́й Рог (укр. Криви́й Ріг) — город в Днепропетровской области Украины, центр Криворожского района, Криворожской городской общины и Криворожской агломерации.Основан в 1775 году и расположен на месте слияния рек Ингульца и Саксагани.");
        request.setAttribute("city",city);
        request.getRequestDispatcher("/cityInfo.jsp").forward(request,response);
    }

    public void destroy() {
    }
}