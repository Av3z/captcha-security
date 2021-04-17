package me.willyan.captchasegurity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import me.willyan.captchasegurity.util.Captcha;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        String captcha = Captcha.security();
        textView.setText(captcha);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textCaptcha = editText.getText().toString();
                if(textCaptcha.equals(captcha)){
                    Toast.makeText(MainActivity.this, "Captcha Correto!", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Captcha Incorreto!", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}