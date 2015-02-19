package exampleF;

import java.util.List;

public class To {

    /*
        The only thing in which this example differs from example E, is that this one uses static an factory method pattern,
        so it will be easier for the client to construct the object.
    */

    private List<String> to;

    private To() {
    }

    public static List<String> to(List<String> to) {
        return validate(to);
    }

    private static List<String> validate(List<String> value) {
        if (value == null || value.size() <0 || emailsFormatIsNotOk(value))
            throw new exampleD.EmailSendingException("Not enough recipients or one of the emails is not in the right format");
        return value;
    }

    private static boolean emailsFormatIsNotOk(List<String> value) {
        return false;

    }
}
