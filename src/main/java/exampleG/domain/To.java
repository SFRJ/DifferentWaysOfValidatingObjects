package exampleG.domain;

import java.util.List;

public class To {

    /*
        Should not use validation on objects construction time, this could easy make the
        system difficult to upgrade and support multiple clients that could have different validation
        expectations this is just a  tiny type nothing else.
    */

    private List<String> to;

    private To(List<String> to) {
        this.to = to;
    }

    public static To to(List<String> to) {
        return new To(to);
    }


}
