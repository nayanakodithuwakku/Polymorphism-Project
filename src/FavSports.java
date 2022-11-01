public class FavSports {
    String sport1 = "Cricket";
    String sport2 = "Football";
    String sport3 = "Rugby";
}
class Group1 extends FavSports{
    String sport1 = "CRICKET";
    String sport2 = "FOOTBALL";
    String sport3 = "RUGBY";
}
class TestProgram{
    public static void main(String[] args) {
        FavSports f = new Group1();
        System.out.println(f.sport1);
        System.out.println(f.sport2);
        System.out.println(f.sport3);
    }
}













