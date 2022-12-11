public class Main {
    public void eenmethode(int getal){
        if(getal%2==0){
            System.out.println("het getal is even");
        }
        else{
            System.out.println("het getal is oneven");
        }
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.eenmethode(29);
        m.eenmethode(22);
        System.out.println("Hello world!");

    }
}