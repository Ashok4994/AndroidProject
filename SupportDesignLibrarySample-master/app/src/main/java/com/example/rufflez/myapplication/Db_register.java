package com.example.rufflez.myapplication;

/**
 * Created by A$hok on 08-03-2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by priya on 3/10/2015.
 */
public class Db_register extends Activity {

    DatabaseHelper helper = new DatabaseHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.db_register);
    }

    public void onSignUpClick(View v)
    {
        if(v.getId()== R.id.Bsignupbutton)
        {
            EditText name = (EditText)findViewById(R.id.TFname);
            EditText email = (EditText)findViewById(R.id.TFemail);
            EditText uname = (EditText)findViewById(R.id.TFuname);
            EditText pass1 = (EditText)findViewById(R.id.TFpass1);
            EditText pass2 = (EditText)findViewById(R.id.TFpass2);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();
            String attnd= "0";
            String marks="0";

            if(!pass1str.equals(pass2str))
            {
                //popup msg
                Toast pass = Toast.makeText(Db_register.this , "Passwords don't match!" , Toast.LENGTH_SHORT);
                pass.show();
            }
            else
            {
                //insert the detailes in database
                Db_Contact c = new Db_Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setUname(unamestr);
                c.setPass(pass1str);
                c.setAttendance(attnd);
                c.setMarks(marks);

                helper.insertContact(c);
                Toast.makeText(getApplicationContext(), "Registraion Success.... ", Toast.LENGTH_LONG).show();
                Intent i=new Intent(this,Db_main.class);
                startActivity(i);
            }

        }

    }


}