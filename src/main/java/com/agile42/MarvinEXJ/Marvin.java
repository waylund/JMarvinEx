package com.agile42.MarvinEXJ;

/**
 * Created by danielmlynn on 9/20/16.
 */
public class Marvin {

    public String talk(String statement)
    {
        String blah = statement.substring(statement.length()-1);
        if (blah.equals("?"))
            return "I don't care.";
        return "Whatever.";
    }
}
