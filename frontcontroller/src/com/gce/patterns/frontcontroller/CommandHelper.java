package com.gce.patterns.frontcontroller;

public class CommandHelper {


    public Command getCommand(String requestURI) {
        if (requestURI.equals("/viewStudentDetails.do")) {
            return new ViewStudentCommand();
        }
        return null;
    }
}
