/**
 * Created by svadhera on 9/7/16.
 */
public class HelloWorldGreeter implements Greeter {

    /**
     * String variable name
     */
    private String name;

    /**
     * Setter to set the private variable name
     * @param name the name of the person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Prints the greeting message concatenated with the name of person.
     *
     * @return String greeting message
     */
    public String getGreeting() {
        return "Hello world from " + name + "!";
    }
}
