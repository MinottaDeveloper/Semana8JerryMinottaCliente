package com.example.a1113681552.semana8jerryminotta;

import android.util.Log;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.Socket;

public class Cliente extends Thread{


    @Override
    public void run() {
        try {
            Socket s= new Socket("10.0.2.2",5000);
            Log.e("DEBUG","Conexion exitosa!");

            OutputStream outputStream = s.getOutputStream();

            PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream));
            out.println("Si funciono!");
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
