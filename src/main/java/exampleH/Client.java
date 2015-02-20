package exampleH;

import exampleG.criticalservices.CriticalServices;
import exampleH.domain.Email;
import exampleH.noncriticalservices.NonCriticalServices;

public class Client {

    /*
        This approach differs from the previous exmple G in a way that there is no an EmailSender that sequentially
        will call the services, instead of that, there is a decorator that decorates the call to the main behavoir
    */


    public static void main(String[] args) {
        CriticalServices criticalServices = new CriticalServices();
        NonCriticalServices decorator = new NonCriticalServices(criticalServices);
        decorator.useService(createSomeEmail());
    }

    private static Email createSomeEmail() {
        //Some email is created for the client to send;
        return null;
    }
}
