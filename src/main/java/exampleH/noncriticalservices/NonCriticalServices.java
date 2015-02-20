package exampleH.noncriticalservices;

import exampleG.criticalservices.CriticalServices;
import exampleH.decorator.TaskInterface;
import exampleH.domain.Email;

public class NonCriticalServices implements TaskInterface {

    private CriticalServices criticalServices;
    private SpellChecker spellChecker;
    private Formater formater;
    private Colourer colourer;

    public NonCriticalServices() {
        spellChecker = new SpellChecker();
        formater = new Formater();
        colourer = new Colourer();
    }

    public NonCriticalServices(SpellChecker spellChecker, Formater formater, Colourer colourer) {
        this.spellChecker = spellChecker;
        this.formater = formater;
        this.colourer = colourer;
    }

    public NonCriticalServices(CriticalServices criticalServices) {
        this();//Default all services
        this.criticalServices = criticalServices;
    }


    public void useService(Email email) {
        //Decorate criticalServices and then carry on
        spellChecker.checkSpelling(email.getContent());
        formater.format(email);
        colourer.colour(email);
    }
}
