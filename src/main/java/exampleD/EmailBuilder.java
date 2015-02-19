package exampleD;

import java.util.List;

public class EmailBuilder {

    /*
        This is an implementation of the Fluent builder pattern.
        It allows us to have optional fields, since we don't necessarily have to call all the with methods.
        The with() methods are used to assigning values to the fields.
        But also could be used to validate the values that arrive, (in the case they arrive)
        Continue to example E for more alternatives.
    */

    private List<String> to;
    private List<String> cc;
    private String subject;
    private String content;

    public EmailBuilder withTo(List<String> to) {
        emailsAmountAndFormatIsValid(to);
            this.to = to;
            return this;
    }

    public EmailBuilder withCc(List<String> cc) {
        emailsAmountAndFormatIsValid(cc);
        this.cc = cc;
        return this;
    }

    public EmailBuilder withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public EmailBuilder withContent(String content) {
        this.content = content;
        return this;
    }

    public Email build() {
        return new Email(to, cc, subject, content);
    }

    private boolean emailsAmountAndFormatIsValid(List<String> emails) {
        //Code that validates the email ...
        if(emails == null || emails.size() == 0 || someEmailIsNotInRightFormat(emails))
            throw new EmailSendingException("Not enough recipients or one of the emails is not in the right format");
        return true;
    }

    private boolean someEmailIsNotInRightFormat(List<String> emails) {
        return false;
    }
}
