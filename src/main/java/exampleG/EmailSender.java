package exampleG;

import exampleG.criticalservices.CriticalServices;
import exampleG.domain.Email;
import exampleG.noncriticalservices.NonCriticalServices;

public class EmailSender {

    private CriticalServices criticalServices;
    private NonCriticalServices nonCriticalServices;

    public EmailSender() {
        criticalServices = new CriticalServices();
        nonCriticalServices = new NonCriticalServices();
    }

    public EmailSender(CriticalServices criticalServices, NonCriticalServices nonCriticalServices) {
        this.criticalServices = criticalServices;
        this.nonCriticalServices = nonCriticalServices;
    }

    public void send(Email email) {
        nonCriticalServices.useService(email);
        criticalServices.useService(email);
    }
}
