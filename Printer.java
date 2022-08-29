
public class Printer {
    private static Printer instance;
    private Printer() {} //외부에서 접근하지 못하게
    public void print(String msg){
        System.out.println("*******************");
        System.out.println(msg);
        System.out.println("*******************");
    }

    //객체 생성 로직
    public static Printer getInstance(){ //정적인 메소드 동적인 메소드
        // getInstance() 책임은 class에게 있다.
        if(instance ==null) instance = new Printer();
        return instance;
    }
}
