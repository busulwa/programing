package GenericMethods;

public class ClasswithmultDatatypes<data1,data2> {// a class with multiple datatypes

    data1 valueone;
    data2 valuetwo;


//crate a constructor
    public ClasswithmultDatatypes(data1 value1, data2 value2) {
        this.valueone = value1;
        this.valuetwo = value2;
    }
    public void setValueone(data1 valueone) {
        this.valueone = valueone;
    }

    public void setValuetwo(data2 valuetwo) {
        this.valuetwo = valuetwo;
    }


    public data1 getValueone() {
        return valueone;
    }

    public data2 getValuetwo() {
        return valuetwo;
    }
}
