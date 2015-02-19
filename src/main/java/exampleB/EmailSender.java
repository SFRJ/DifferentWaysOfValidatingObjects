package exampleB;

public class EmailSender {

    /*
       The method sendEmail is delegating the responsibility of validating the email to a validator.
       This means that every time a client that calls that method, will have to pass a validator.
       Continue to example C for other alternatives ...
    */

    public void sendEmail(Email email, EmailValidator validator) throws EmailSendingException{
        validator.validate(email);
        //code for sending the email ...
    }
}
