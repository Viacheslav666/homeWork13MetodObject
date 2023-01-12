public class Main {



    public static void main(String[] args) {
        Person daria = new Person("Даша", 19);
        if (daria.isAdult()) {
            System.out.println("Go to the Moscow");
        } else {
            System.out.println("You place is in bali");
        }
        daria.setAge(1);
        System.out.println(daria.toString());
    }

}