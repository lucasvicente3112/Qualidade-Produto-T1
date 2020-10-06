import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class lancheTest {

    @Test
    void preco_1() {
        lanche l = new lanche();
        String result = l.getTotal(3,2);
        assertEquals( "Total: R$ 10.0", result);
    }

    @Test
    void preco_2() {
        lanche l = new lanche();
        String result = l.getTotal(4,3);
        assertEquals( "Total: R$ 6.0", result);
    }

    @Test
    void preco_3() {
        lanche l = new lanche();
        String result = l.getTotal(2,3);
        assertEquals( "Total: R$ 13.5", result);
    }

    @Test
    void preco_4() {
        lanche l = new lanche();
        String result = l.getTotal(5,5);
        assertEquals( "Total: R$ 7.5", result);
    }
}