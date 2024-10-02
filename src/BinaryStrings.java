public class BinaryStrings {
        public static void main(String[] args) {

            int x =2;
            //converting int x to BinaryString
            String binary = Integer.toBinaryString(x);

            // prints x in binary format which =10
            System.out.println("The BinaryString value of 2 is: \t"+binary);

//now shifting x to left by 2 - this will multiply x 4 since << shifts2 places x2, prints out the decimal value
        x= ( x << 1);
Integer.toBinaryString(x);
            // Predicting the new values after left shift
            // After shifting left by 1, the new value should be 4 (which is 100 in binary)
            // Predicted decimal value: 4
            // Predicted binary string: 100

            System.out.println(x);
            System.out.println("the new x to binary:"+ Integer.toBinaryString(x)+ "\n");
//************************************************************************************

          // Changing  150 to binary and shifting it to the right >> by 2

            int y =150;
            //converting int y to BinaryString
            String binary1 = Integer.toBinaryString(y);

            // prints y in binary format which =10
            System.out.println("The BinaryString value of 150 is: \t"+binary1);

//now shifting y to right by 2 - this will multiply x 4 since << shifts2 places x2, prints out the decimal value
           y= ( y >> 2);
            Integer.toBinaryString(y);
            // Predicting the new values after left shift
            // After shifting right by 2, the new value should be 37 (which is 100101 in binary)
            // Predicted decimal value: 37
            // Predicted binary string: 100101

            System.out.println(y);
            System.out.println("the new x to binary:"+ Integer.toBinaryString(y));
        }
    }



