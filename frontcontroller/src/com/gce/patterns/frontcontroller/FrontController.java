package com.gce.patterns.frontcontroller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("*.do")
public class FrontController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String requestURI = request.getRequestURI();
        CommandHelper commandHelper = new CommandHelper();
        Command command = commandHelper.getCommand(requestURI);
        String view = command.execute(request, response);
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.dispatch(request, response, view);

    }
}
