public class psychiatrist{
    public void examine(moodyObject moodyObject){
        System.out.println("How are you feeling today?");
        moodyObject.queryMood();
    }

    public void observe(moodyObject moodyObject){
        moodyObject.expressFeelings();
        System.out.println("Observation: "+moodyObject.toString());
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
