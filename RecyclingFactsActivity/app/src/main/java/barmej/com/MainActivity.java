package barmej.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView factTextView;
    private Button factButton;
    public static final String TAG = "FACT_TAG";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //تعيين المتغيرات
        factTextView = findViewById(R.id.factTextView);
        factButton = findViewById(R.id.factButton);

        RecyclingFactsGenerator recyclingFactsGenerator = new RecyclingFactsGenerator(this);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //change text by clicking the button


                String fact= recyclingFactsGenerator.generateFact();
                factTextView.setText(fact);

                // here I will declare Toast
                Toast.makeText(MainActivity.this,getResources().getString(R.string.button_pressed) , Toast.LENGTH_LONG).show();
                Log.e(TAG, "تم تشغيل التطبيق");
            }
        };
        factButton.setOnClickListener(onClickListener);

    }
}