import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {

    @Test
    public void shouldMakeGreenFilledSide1() {
        Shape mySquare = new Square();
        System.out.println(mySquare);
        assertEquals("green", mySquare.getColor());
        assertEquals(true, mySquare.isFilled());
        assertEquals(1, mySquare.getArea());
        assertEquals(4, mySquare.getPerimeter());
    }

    @Test
    public void shouldMakePinkNotFilledSide5() {
        Square mySquare = new Square("pink", false, 5);
        System.out.println(mySquare);
        assertEquals("pink", mySquare.getColor());
        assertEquals(false, mySquare.isFilled());
        assertEquals(5, mySquare.getLength());
        assertEquals(5,mySquare.getWidth());
        assertEquals(25, mySquare.getArea());
        assertEquals(20, mySquare.getPerimeter());
        assertEquals(Math.sqrt(50), mySquare.getDiagonal());
        assertEquals(true, mySquare.isRectangle());
        assertEquals(true, mySquare.isSquare());
    }

}

