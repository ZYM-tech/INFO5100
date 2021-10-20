public class happy extends moodyObject{
    @Override
    protected String getMood() {
        return "happy";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
