package edu.bu.met.cs665.model;

/**
 * Author: Varunkumar G S
 * Email: gsv@bu.edu
 * Date: 03/16/2023
 * Description: Class for Email definition.
 **/

public class Email {

    private String subjectLine;
    private String body;


    public Email() {
        subjectLine = "Subject Line";
        body = "Body";
    }

    public void setSubjectLine(String subjectLine) {
        this.subjectLine = subjectLine;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String toString() {
        return subjectLine + "\n" + body;
    }
}
