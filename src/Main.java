public class Main {
    public void evenCheck(int getal){
        if(getal%2==0){
            System.out.println("het getal is even");
        }
        else{
            System.out.println("het getal is oneven");
        }
    }
    public void lengteWeergeven(String woord){
        int lengte = woord.length();
        System.out.println(lengte);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.evenCheck(29);
        m.evenCheck(22);
        m.lengteWeergeven("Hallo");
    }
}