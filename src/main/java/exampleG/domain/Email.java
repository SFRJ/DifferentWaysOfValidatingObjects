package exampleG.domain;

public class Email {

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
