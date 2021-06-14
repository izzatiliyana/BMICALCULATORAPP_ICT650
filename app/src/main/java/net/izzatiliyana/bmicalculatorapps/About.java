package net.izzatiliyana.bmicalculatorapps;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class About extends AppCompatActivity {

    android.widget.Button mrecalculatebmi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        TextView text = (TextView)findViewById(R.id.text_view);
        text.setMovementMethod(LinkMovementMethod.getInstance());

        mrecalculatebmi=findViewById(R.id.recalculatebmi);

        mrecalculatebmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(About.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });



    }
}