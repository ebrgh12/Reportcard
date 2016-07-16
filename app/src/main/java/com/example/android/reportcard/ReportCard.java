package com.example.android.reportcard;
import android.util.Log;
/**
 * Created by giris on 7/16/2016.
 */
public class ReportCard {
    /** Default translation for the word */
    private String marksStudent;
    /** Miwok translation for the word */
     private String marksSubject;
    //Making use of constructors
        // Making use of Getters
    public ReportCard(String x, String y)
    {
        marksStudent = x;
        marksSubject = y;
    }
    // Making use of setters
    public String getScore()
    {
        return marksStudent;
    }
    // Making use of setters
    public String getSubject()
    {
        return marksSubject;
    }
    // Making use of tostring() to print the content of object in Log as messages
    @Override
    public String toString() {
        return "ReportCard{" +
                "marksStudent='" + marksStudent + '\'' +
                ", marksSubject='" + marksSubject + '\'' +
                '}';
    }
}

