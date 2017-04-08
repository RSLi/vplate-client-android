package org.wayriad.foodfrisbee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.wayriad.foodfrisbee.models.Command;
import org.wayriad.foodfrisbee.models.Commander;

public class MainActivity extends AppCompatActivity
{

    Button btnForward;
    Button btnBack;
    Button btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnForward = (Button) findViewById(R.id.btn_forward);
        btnBack = (Button)findViewById(R.id.btn_back);
        btnStop = (Button) findViewById(R.id.btn_stop);

        btnForward.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Commander.send(Command.FORWARD, MainActivity.this);
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Commander.send(Command.STOP, MainActivity.this);
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Commander.send(Command.BACK, MainActivity.this);
            }
        });
    }

//    public void showToastWarning() {
//         Toast.makeText(this, "Threading Error, check debugger", Toast.LENGTH_LONG).show();
//    }
}
