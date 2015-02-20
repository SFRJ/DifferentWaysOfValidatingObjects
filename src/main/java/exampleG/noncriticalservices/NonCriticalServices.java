package exampleG.noncriticalservices;

import exampleG.domain.Email;

public class NonCriticalServices {

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

    public void useService(Email email) {
        spellChecker.checkSpelling(email.getContent());
        formater.format(email);
        colourer.colour(email);
    }
}
