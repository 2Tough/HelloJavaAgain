package com.mooc.interfaces.hello;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ConsoleGreeter implements Greeter {

    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Override
    public String greet(String name) {
        String safeName = (name == null || name.isBlank()) ? "friend" : name;
        String now = LocalDateTime.now().format(fmt);
        return "👋 Hola, " + safeName + "! — " + now;
    }
}
