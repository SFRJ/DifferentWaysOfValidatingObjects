package exampleE;

import java.util.List;

public class Email {

    /*
        Each of the fields of the Email are tiny typed.
        And the validation is embedded.
        Go to each to "To", to see an example of validation
    */

    private To to;
    private Cc cc;
    private Subject subject;
    private Content content;

    public Email(To to, Cc cc, Subject subject, Content content) {
        this.to = to;
        this.cc = cc;
        this.subject = subject;
        this.content = content;
    }

    public To getTo() {
        return to;
    }

    public Cc getCc() {
        return cc;
    }

    public Subject getSubject() {
        return subject;
    }

    public Content getContent() {
        return content;
    }
}
