public abstract class moodyObject {
    protected abstract String getMood();

    public abstract void expressFeelings();

    public void queryMood(){
        String emo = getMood();
        System.out.println("I feel "+ emo +" today");
    }
}
