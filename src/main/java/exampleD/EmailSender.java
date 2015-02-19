package exampleD;

import exampleB.Email;
import exampleB.EmailSendingException;
import exampleB.EmailValidator;

public class EmailSender {

    /*
       In this example, the email sender has the single responsibility of sending the email,
       and it does not need any dependency to validate the email.
       Continue to EmailBuilder to see the validation approach ...
    */

    public void sendEmail(Email email) throws EmailSendingException{
        //code for sending the email ...
    }
}
