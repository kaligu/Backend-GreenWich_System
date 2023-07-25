package lk.greenwich.controller;
/*
 * @author : H.C.Kaligu Jayanath
 * Date    : 7/25/2023
 * Time    : 4:12 AM
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AccessServlet", value = "/Access-Login")
public class AccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" tested");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
