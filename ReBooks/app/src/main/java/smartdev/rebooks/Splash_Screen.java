package smartdev.rebooks;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

        Handler handler = new Handler();
        Runnable runnable = (new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this, Main_Menu.class );
                startActivity(intent);
                Toast.makeText(Splash_Screen.this,"Welcome",Toast.LENGTH_SHORT);
                finish();
            }
        });

        handler.postDelayed(runnable,2000);
    }
}
