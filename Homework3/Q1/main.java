public class main {
    public static void main(String[] args){
        psychiatrist psy = new psychiatrist();
        sad s = new sad();
        happy h = new happy();

        psy.examine(h);
        System.out.println("\n");
        psy.observe(h);
        System.out.println("\n");

        psy.examine(s);
        System.out.println("\n");
        psy.observe(s);
        System.out.println("\n");
    }
}
