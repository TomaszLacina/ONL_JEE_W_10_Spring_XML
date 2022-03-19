package pl.coderslab.beans;

public class HelloWorld {

    private String message;
    private Boolean isSpring;

    public HelloWorld(String message, Boolean isSpring) {
        this.message = message;
        this.isSpring = isSpring;
    }

    public void printMessage() {
        System.out.println("Your Message : " + message + " is it spring yet ?" + isSpring);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
