package examples.first2;

public class MyControllerMain {
    public static void main(String[] args) {

        MyController controller = new MyController(new MyServiceImpl(new MyDaoImpl()));
    }
}
