import cs.csmath.complexnumber.ComplexNumber;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.*;

public class complexnumberTest  {

    @Test
    public void GetRealFart() {

    }

    @Test
    public void SetRealFart() {
    }

    @Test
    public void getImagFart() {
        ComplexNumber CN1= new ComplexNumber(1.888,2.895);
        ComplexNumber CN2= new ComplexNumber(2.22,3.113);
        CN2.getImagPart();
        CN1.getImagPart();
    }

    @Test
    public void setImagFart() {
    }

    @Test
    public void add() {
        ComplexNumber CN1= new ComplexNumber(4.02,6.01);
        ComplexNumber CN2= new ComplexNumber(3.01, 6.99);
        CN2.add(CN1);
        assertEquals(7.03, CN2.getRealPart(), 0.000001);
    }

    @Test
    public void sub() {
        ComplexNumber CN1 = new ComplexNumber(4.77,6.77);
        ComplexNumber CN2= new ComplexNumber(1.11, 5.89);
                CN2.sub(CN1);
        assertEquals(5.88, CN2.getRealPart(), 0.000000001);
    }

    @Test
    public void div() {
        ComplexNumber CN1 = new ComplexNumber(7.55,3.12);
        ComplexNumber CN2= new ComplexNumber(2.88, 8.03);
        CN2.div(CN1);
        assertEquals(10.43,CN2.getRealPart(), 0.000000001 );
    }

    @Test
    public void conj() {
    }

    @Test
    public void abs() {
    }

    @Test
    public void getRealPart() {

    }

    @Test
    public void setRealPart() {
    }

    @Test
    public void getImagPart() {
    }

    @Test
    public void setImagPart() {
    }




    @Test
    public void add1() {
    }

    @Test
    public void mult() {
        ComplexNumber CN1= new ComplexNumber(3.04,7.07);
        ComplexNumber CN2= new ComplexNumber(3.01, 5.555);
        CN2.mult(CN1);
        assertEquals(3.01, CN2.getRealPart(), 0.000001);
    }

    @Test
    public void testToString() {
        ComplexNumber cn= new ComplexNumber();
        String s = cn.toString();
        assertEquals("0.0+0.0i", s );
    }
}