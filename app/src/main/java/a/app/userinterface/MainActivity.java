package a.app.userinterface;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trylayout);
    }

    public void gotoLogInPage(View view) {

        Intent intent =new Intent(this, loginActivity.class);
        startActivity(intent);
    }
}
