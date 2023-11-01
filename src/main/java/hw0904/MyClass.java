package hw0904;

public class MyClass {
    private int field1;
    public String field2;
    protected double field3;

    public MyClass() {
    }

    public MyClass(int field1, String field2, double field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public int getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public double getField3() {
        return field3;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setField3(double field3) {
        this.field3 = field3;
    }
}