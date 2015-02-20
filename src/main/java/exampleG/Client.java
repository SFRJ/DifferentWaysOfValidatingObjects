package exampleG;

import exampleG.domain.Email;

public class Client {

    /*
        When the feature we work on needs many helper services, not just validation, the usage of a non-anemic model such as in the previous example is probably
        not desirable, since the clients can be multiple. In this example, I am assuming that the EmailSender class from example C(where I used to pass a validator)
        has evolved so much in the dependencies it needs, that we have to redistribute logically those services.
        What we did is use parametrized constructors that allow custom implementations to exist, but also provide default implementations via a default constructor.
        If we follow the methods downstream, we will see how the services are designed to be as atomic as possible.
        The main idea of this approach is to redistribute the complexity by creating more meaningful groups of services.
        A similar alternative to this can be found in the example H ...
    */


    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        emailSender.send(createSomeEmail());
    }

    private static Email createSomeEmail() {
        //Some email is created for the client to send;
        return null;
    }
}
