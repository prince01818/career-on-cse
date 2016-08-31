package com.example.prince.careeroncse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class FieldsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fields);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fields, menu);
        return true;
    }
    public void programmers(View v){
        Intent theIntent = new Intent(FieldsActivity.this,DetailsActivity.class);
        startActivity(theIntent);
    }
    public void hardware(View v){
        Intent theIntent = new Intent(FieldsActivity.this,HardwareActivity.class);
        startActivity(theIntent);
    }
    public void software(View v){
        Intent theIntent = new Intent(FieldsActivity.this,SoftwareActivity.class);
        startActivity(theIntent);
    }
    public void system(View v){
        Intent theIntent = new Intent(FieldsActivity.this,SystemActivity.class);
        startActivity(theIntent);
    }
    public void networking(View v){
        Intent theIntent = new Intent(FieldsActivity.this,NetworkingActivity.class);
        startActivity(theIntent);
    }
    public void database(View v){
        Intent theIntent = new Intent(FieldsActivity.this,DatabaseActivity.class);
        startActivity(theIntent);
    }
    public void web(View v){
        Intent theIntent = new Intent(FieldsActivity.this,WebActivity.class);
        startActivity(theIntent);
    }
    public void graphics(View v){
        Intent theIntent = new Intent(FieldsActivity.this,GraphicsActivity.class);
        startActivity(theIntent);
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
        if(id == R.id.back){
            Intent theIntent = new Intent(FieldsActivity.this,MainActivity.class);
            startActivity(theIntent);
        }

        return super.onOptionsItemSelected(item);
    }
}
