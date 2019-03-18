package cs.csmath.complexnumber;

public class ComplexNumber {
    public double getRealFart() {
        return realFart;
    }

    public void setRealFart(double realFart) {
        this.realFart = realFart;
    }

    public double getImagFart() {
        return imagFart;
    }


    public void setImagFart(double imagFart) {
        this.imagFart = imagFart;
    }

    private double realFart;
    private double imagFart;

    public ComplexNumber (double realFart, double imagFart)
    {
        this.realFart = realFart;
        this.imagFart = imagFart;
    }

    public ComplexNumber()
    {
        super();
    }

    public double add(ComplexNumber otherCN) {
        this.setRealFart(this.getRealPart() + otherCN.getRealFart());
        this.setImagPart(this.getImagPart() + otherCN.getImagPart());
        return(realFart);

    }

    public void sub(ComplexNumber otherCN){
      this.setRealFart(this.getRealPart()+ otherCN.getRealPart());
        this.setImagPart(this.getImagPart()+ otherCN.getImagPart());
    }


    public void div(ComplexNumber otherCN) {


        double divisor = (otherCN.getRealPart()*otherCN.getRealPart() + otherCN.getImagFart()*otherCN.getImagPart());
        this.setRealPart((this.getRealPart()*otherCN.getImagPart() + this.getImagPart()*otherCN.getImagPart()) / divisor);
        this.setImagPart((this.getImagPart()*otherCN.getRealPart() - this.getRealPart()*otherCN.getImagPart()) / divisor);
    }




     public void  mult(ComplexNumber OtherCN) {

    }
    public void conj(){

    }

    public void abs(){

    }

    public double getRealPart() {
        return this.realFart;

    }

    public void setRealPart(double realP){

    }

    public double  getImagPart()

    {return  this.imagFart;}


    public void  setImagPart(double imag) {
    }

    public String toString()
    {return new String ("String");}

    // class method for adding two complex numbers

    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN)
    {return new ComplexNumber();}




     public static void main(String[] args) {
        ComplexNumber cn1= new ComplexNumber(1.0,   1.0);
        System.out.println("CN1 real: " + cn1.getRealPart() + "imag" + cn1.getImagPart());
     }


}
