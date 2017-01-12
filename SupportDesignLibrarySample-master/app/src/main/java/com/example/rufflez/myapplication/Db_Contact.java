package com.example.rufflez.myapplication;

/**
 * Created by A$hok on 08-03-2016.
 */
public class Db_Contact {
    String name ,email,uname,pass,marks,attendance;

    public void setName(String name)
    {

        this.name = name;
    }
    public String getName()
    {

        return this.name;
    }
    public void setEmail(String email)
    {

        this.email = email;
    }
    public String getEmail()
    {

        return this.email;
    }
    public void setUname(String uname)
    {

        this.uname = uname;
    }
    public String getUname()
    {

        return this.uname;
    }
    public void setPass(String pass)

    {
        this.pass = pass;
    }
    public String getPass()
    {
        return this.pass;
    }

    public void setMarks(String marks){
        this.marks=marks;
    }
    public String getMarks()
    {
        return this.marks;
    }
    public void setAttendance(String attendance){this.attendance=attendance;}
    public String getAttendance()
    {
        return this.attendance;
    }


}