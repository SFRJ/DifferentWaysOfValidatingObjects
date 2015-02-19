package exampleD;

import java.util.List;

public class Email {
    private List<String> to;
    private List<String> cc;
    private String subject;
    private String content;

    public Email(List<String> to, List<String> cc, String subject, String content) {
        this.to = to;
        this.cc = cc;
        this.subject = subject;
        this.content = content;
    }

    public List<String> getTo() {
        return to;
    }

    public List<String> getCc() {
        return cc;
    }


    public String getSubject() {
        return subject;
    }


    public String getContent() {
        return content;
    }

}
