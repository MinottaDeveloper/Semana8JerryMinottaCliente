package com.example.a1113681552.semana8jerryminotta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


      /*  try {
            InetAddress myIp= InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }*/


      Cliente cliente = new Cliente();
      cliente.start();


    }
}
