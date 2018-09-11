package examples.first;

public class StringBufferTest {

    /**
     * 프로그램 시작점 (doc 주석)
     * @param args
     */
    public static void main(String args[]){

        // 스트링 버퍼를 사용
        StringBuffer sb = new StringBuffer();

        // 스트링 버퍼의 메소드를 사용한다.
        sb.append("hello");
        sb.append(" ");
        sb.append("world!!");

        // sb가 가지고 있는 toString() 메소드는 내부적인 문자열을 반환한다.
        System.out.println(sb.toString());
    }
}
