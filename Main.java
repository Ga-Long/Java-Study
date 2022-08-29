public class Main {
    public static void main(String[] args) { //psvm
        Printer p1 = Printer.getInstance();
        p1.print("Design Pattern1");

        Printer p2 = Printer.getInstance(); //new라는 연산자는 static이다
        p2.print("Design Pattern2");

        System.out.println(p1.toString()); //객체의 id 식별자임
        System.out.println(p2.toString());

        //객체 생성 로직을 다른 사람이 따로 만들지 못하게 , 객체를 하나만 만들 수 있도록
    }
}
