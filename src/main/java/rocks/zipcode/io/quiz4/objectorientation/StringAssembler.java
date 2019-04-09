package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {

    private Character delimeter;
    private String temp;

    public StringAssembler(Character delimeter) {

        this.delimeter = delimeter;
        temp = "";
    }

    public StringAssembler append(String str) {
        //each time appends called its adding a str and a delimiter to the base temp string which is an empty string ""
        temp += str + delimeter;

        return this;
    }

    public String assemble() {

        return temp.substring(0, temp.length() - 1);
    }
}
