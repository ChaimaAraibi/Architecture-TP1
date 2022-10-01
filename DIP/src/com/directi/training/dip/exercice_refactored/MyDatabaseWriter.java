package com.directi.training.dip.exercice_refactored;

public class MyDatabaseWriter implements Writer
{
    @Override
    public void write(String input)
    {
        MyDatabase database = new MyDatabase();
        database.write(input);
    }
}
