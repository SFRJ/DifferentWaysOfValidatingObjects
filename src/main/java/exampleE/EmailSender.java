package exampleE;

import exampleB.Email;
import exampleB.EmailSendingException;

public class EmailSender {

    /*
       In this example, the email sender has the single responsibility of sending the email,
       and it does not need any dependency to validate the email.
       Continue to the Email its self to see the validation approach ...
       Or continue to example F for other alternative
    */

    public void sendEmail(Email email) throws EmailSendingException{
        //code for sending the email ...
    }
}
