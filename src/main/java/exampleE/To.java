package exampleE;

import java.util.List;

public class To {

    private List<String> to;

    public To(List<String> to) {
        this.to = validate(to);
    }

    public List<String> getTo() {
        return to;
    }

    private List<String> validate(List<String> value) {
        if (value == null || value.size() <0 || emailsFormatIsNotOk(value))
            throw new exampleD.EmailSendingException("Not enough recipients or one of the emails is not in the right format");
        return value;
    }

    private boolean emailsFormatIsNotOk(List<String> value) {
        return false;

    }
}
