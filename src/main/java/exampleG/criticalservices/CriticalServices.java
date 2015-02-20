package exampleG.criticalservices;

import exampleG.domain.Email;

public class CriticalServices {

    private EmailClient emailClient;
    private Validator validator;

    public CriticalServices() {
        //provide default implementation for dependencies
        emailClient = new EmailClient();
        validator = new Validator();
    }

    //This second constructor will enable testing
    public CriticalServices(EmailClient emailClient, Validator validator) {
        this.emailClient = emailClient;
        this.validator = validator;
    }

    public void useService(Email email) {
        validator.validate(email);
        emailClient.send(email);
    }
}
