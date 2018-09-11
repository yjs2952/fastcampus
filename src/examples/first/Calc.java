package examples.first;

/**
 * 간단한 계산기
 */
public class Calc {

    // 필드 선언
    private int value;

    // 기본 생성자
    public Calc(){
        this.value = 0;
    }

    // 생성자
    public Calc(int value){
        // 필드 value를 파라미터 value로 초기화 한다.
        this.value = value;
    }

    /**
     * plusValue를 받아서 누적한다.
     * @param plusValue
     */
    public void plus(int plusValue){
        this.value = this.value + plusValue;
    }

    /**
     * minusValue를 받아서 뺀다.
     */
    public void minus(int minusValue){
        this.value = this.value - minusValue;
    }

    /**
     * multipleValue를 받아서 곱한다.
     */
    public void multiple(int multipleValue){
        this.value = this.value * multipleValue;
    }

    /**
     * divisionValue를 받아서 나눈다.
     */
    public void divide(int divisionValue){
        this.value = this.value / divisionValue;
    }

    /**
     * value 0으로 초기화.
     */
    public void clear(){
        this.value = 0;
    }

    /**
     * 내부적인 값을 반환한다.
     * @return
     */
    public int getValue(){
        return this.value;
    }
}
