import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void shouldMakeGreenFilledRadius1() {
        Shape myCircle = new Circle();
        System.out.println(myCircle);
        assertEquals("green", myCircle.getColor());
        assertEquals(true, myCircle.isFilled());
        assertEquals(Math.PI, myCircle.getArea());
        assertEquals(2 * Math.PI, myCircle.getPerimeter());
    }

    @Test
    public void shouldMakeBlueNotFilledRadius2() {
        Circle myCircle = new Circle("blue", false, 2);
        System.out.println(myCircle);
        assertEquals("blue", myCircle.getColor());
        assertEquals(false, myCircle.isFilled());
        assertEquals(4 * Math.PI, myCircle.getArea());
        assertEquals(4 * Math.PI, myCircle.getCircumference());
        assertEquals(2, myCircle.getRadius());
        assertEquals(true, myCircle.isCircle());
    }

}
