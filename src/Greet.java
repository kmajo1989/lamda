public class Greet {



    void greet(Greeting greeting){
        greeting.perform();
    }


    public static void main(String[] s){
        Greet greet = new Greet();
        HelloGreeting helloGreeting = new HelloGreeting();
        greet.greet(helloGreeting);
        //Greeting lamdaGreeting =  () -> System.out.print("Hello Lamda World!!");
        greet.greet(() -> System.out.print("Hello Lamda World!!"));

    }

}



