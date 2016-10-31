package com.msttech.smrhall;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText username,password;
    Button login,regButton;
    TextView passwordTextView,usernameTextView;

    DatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        if (getIntent().getBooleanExtra("EXIT", false)) {
            finish();
        }

        usernameTextView = (TextView)findViewById(R.id.usernameTextView);
        passwordTextView = (TextView)findViewById(R.id.passwordTextView);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.btn);
        regButton = (Button)findViewById(R.id.regButton);

        databaseHelper = new DatabaseHelper(this);
        check();

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 Cursor result = databaseHelper.getData();

                while (result.moveToNext()){

                    if (username.getText().toString().equals(result.getString(1)) &&
                            password.getText().toString().equals(result.getString(2))) {
                        Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(MainActivity.this, FllorActivity.class));
                    } else {
                        Toast.makeText(MainActivity.this, "Login failed", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Registration.class));
            }
        });

    }

    public void check(){

        Cursor result = databaseHelper.getData();
        if(result.getCount() == 0){
            registration();
        }else{
            Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT).show();

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /*
    @Override
    protected void onResume() {

        super.onResume();
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
        boolean previouslyStarted = prefs.getBoolean(getString(R.string.pref_previously_started), true);
        if (previouslyStarted) {
            SharedPreferences.Editor edit = prefs.edit();
            edit.putBoolean(getString(R.string.pref_previously_started), false);
            edit.commit();
            showHelp();

        }else{
            Toast.makeText(MainActivity.this,"Hoy hoy",Toast.LENGTH_SHORT).show();
        }
    }

        public void showHelp(){

            Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT).show();

            regButton = (Button)findViewById(R.id.regButton);

            username.setVisibility(View.INVISIBLE);
            password.setVisibility(View.INVISIBLE);
            login.setVisibility(View.INVISIBLE);
            usernameTextView.setVisibility(View.INVISIBLE);
            passwordTextView.setVisibility(View.INVISIBLE);

            regButton.setVisibility(View.VISIBLE);

        }
        */

        public void registration(){

            username.setVisibility(View.INVISIBLE);
            password.setVisibility(View.INVISIBLE);
            login.setVisibility(View.INVISIBLE);
            usernameTextView.setVisibility(View.INVISIBLE);
            passwordTextView.setVisibility(View.INVISIBLE);

            regButton.setVisibility(View.VISIBLE);
        }
    }



