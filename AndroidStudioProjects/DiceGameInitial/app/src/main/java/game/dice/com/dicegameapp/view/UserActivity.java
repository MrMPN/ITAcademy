package game.dice.com.dicegameapp.view;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import game.dice.com.dicegameapp.R;
import game.dice.com.dicegameapp.application.GameController;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        //Look for and get editText data
        final EditText editText = findViewById(R.id.editTextName);

        //Look for FAB
        FloatingActionButton fab = findViewById(R.id.userFAB);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GameController gc = GameController.getInstance();
                gc.createPlayer(editText.getText().toString());
                //Toast.makeText(UserActivity.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
