package org.wayriad.foodfrisbee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.wayriad.foodfrisbee.models.Command;
import org.wayriad.foodfrisbee.models.Commander;

public class Running extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_running);
        Commander.send(Command.FORWARD, this);
        Toast.makeText(this, "Success", Toast.LENGTH_LONG).show();
        finish();
    }
}
