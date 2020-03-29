package Lambda_test;

public class Lambdatest1 {
    public static void main(String[] args) {
        cookimpl(new Cook() {
            @Override
            public void makefood() {
                System.out.println("吃饭");
            }
        });
    }
    public static void cookimpl(Cook cook){
        cook.makefood();
    }
}
