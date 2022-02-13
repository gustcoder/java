package com.schoolofnet.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Nashorn {
    public static void main(String... args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        try {
            nashorn.eval("print('Hello World from Nashorn!')");
        } catch(ScriptException ex) {
            ex.getStackTrace();
        }
    }
}
