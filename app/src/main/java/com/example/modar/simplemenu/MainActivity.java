package com.example.modar.simplemenu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Get This Method From Generate -> Override
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.menu1,menu);
        return true;

    }

    // Get This Method From Generate -> Override
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        int id = item.getItemId();

        if(id==R.id.id_home){
            //Toast.makeText(this, "You Pressed Home", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.aptoide.com/store/z-tec"));
            startActivity(intent);
        }
        if(id==R.id.id_settings){
            Toast.makeText(this, "You Pressed Settings", Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.id_exit){
            Toast.makeText(this, "You Pressed Exit", Toast.LENGTH_SHORT).show();
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
