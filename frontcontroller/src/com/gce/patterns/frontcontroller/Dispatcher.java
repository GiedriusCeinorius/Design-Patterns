package com.gce.patterns.frontcontroller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Dispatcher {
    public void dispatch(HttpServletRequest request, HttpServletResponse response, String view) {
        if(view!=null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher(mapPageToView(view));
            try {
                dispatcher.forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String mapPageToView(String view) {
        if(view.equals("showStudentDetails")) {
            return "viewStudentDetails.jsp";
        }
        return null;
    }
}
