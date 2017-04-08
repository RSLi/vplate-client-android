package org.wayriad.foodfrisbee.models;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

import org.wayriad.foodfrisbee.MainActivity;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import static android.R.attr.duration;

public class Commander {

    public static String HOST ="192.168.43.233"; //the ip of raspberry pi
    public static int PORT =8888;
    public static void send(Command cmd, Context context) {
        final Command targetCommand = cmd;
        final Context targetContext = context;
         new Thread(new Runnable() {
            public void run() {
                try {
                    Socket socket = new Socket(HOST, PORT);
                    PrintWriter writer = new PrintWriter(socket.getOutputStream());
                    writer.println(targetCommand.toString());
                    writer.flush();
                    socket.close();
                }catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}