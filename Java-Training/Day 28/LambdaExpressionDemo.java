interface Sayable {
    String say(String message);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Sayable person = (message) -> "I would like to say, " + message;
        System.out.println(person.say("time is precious."));
    }
}
