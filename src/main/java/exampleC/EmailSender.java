package exampleC;

import exampleB.Email;
import exampleB.EmailSendingException;
import exampleB.EmailValidator;

public class EmailSender {

    /*
       The class EmailSender is delegating the responsibility preparing a validator to the client that uses it.
       Continue to example C for other alternatives ...
    */

    private EmailValidator validator;

    public EmailSender(EmailValidator validator) {
        this.validator = validator;
    }

    public void sendEmail(Email email) throws EmailSendingException{
        validator.validate(email);
        //code for sending the email ...
    }
}
