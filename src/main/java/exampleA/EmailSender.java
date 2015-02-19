package exampleA;

public class EmailSender {

    /*
        In this example the sendEmail() method takes the responsibility of
        validating the state of the email before sending it.
        Continue to example B for other alternatives...
    */

    public void sendEmail(Email email) {
        if(email.getTo() != null) {//more validation...
            //code for sending the email ...
        }
    }
}
