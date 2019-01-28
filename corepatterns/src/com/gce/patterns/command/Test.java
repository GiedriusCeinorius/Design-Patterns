package com.gce.patterns.command;

public class Test {

    public static void main(String[] args) {
        Television tv = new Television();
        RemoteControl rm = new RemoteControl();
        OnCommand onCommand = new OnCommand(tv);
        rm.setCommand(onCommand);
        rm.pressButton();
        OffCommand offCommand = new OffCommand(tv);
        rm.setCommand(offCommand);
        rm.pressButton();
    }
}
