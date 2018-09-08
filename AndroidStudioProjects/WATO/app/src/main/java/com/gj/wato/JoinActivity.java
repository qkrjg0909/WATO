package com.gj.wato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoinActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnJoin;
    Button btnCancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }

    public void doValidation (){

    }

    @Override
    public void onClick(View view) {
        btnJoin = (Button)findViewById( R.id.btnJoin );

        btnJoin.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick( View v ) {
                        //Validation Check

                        //true
                            //DB Save
                        //false

                    }
                }
        );

    }

}
