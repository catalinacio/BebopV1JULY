package android.bepopv12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BebopActivity extends AppCompatActivity {
    Button clickButton;
    TextView showText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebop);
            init();
        }

    private void init() {
        clickButton=(Button) findViewById(R.id.btn_click);
        showText=(TextView)findViewById(R.id.textView);
    }

    public void showText(View view) {
         String string="123";

        if(showText.getText().toString().contains(string))
            showText.setText("hello world");
        else
            showText.setText(string);
    }
}
