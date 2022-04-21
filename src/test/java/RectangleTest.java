import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void shouldMakeRedFilledLength1Width1() {
        Shape myRectangle = new Rectangle("red", true);
        System.out.println(myRectangle);
        assertEquals("red", myRectangle.getColor());
        assertEquals(true, myRectangle.isFilled());
        assertEquals(1, myRectangle.getArea());
        assertEquals(4, myRectangle.getPerimeter());
    }

    @Test
    public void shouldMakeGreenFilledLength3Width4() {
        Rectangle myRectangle = new Rectangle(3,4);
        System.out.println(myRectangle);
        assertEquals("green", myRectangle.getColor());
        assertEquals(true, myRectangle.isFilled());
        assertEquals(3, myRectangle.getLength());
        assertEquals(4,myRectangle.getWidth());
        assertEquals(12, myRectangle.getArea());
        assertEquals(14, myRectangle.getPerimeter());
        assertEquals(5, myRectangle.getDiagonal());
        assertEquals(true, myRectangle.isRectangle());
    }

}
