public class sad extends moodyObject{
    @Override
    protected String getMood() {
        return "sad";
    }

    @Override
    public void expressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob ‘");
    }

    public String toString(){
        return "Subject cries a lot";
    }
}
