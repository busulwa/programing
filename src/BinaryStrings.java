public class BinaryStrings {
        public static void main(String[] args) {

            int x =2;
            //converting int x to BinaryString
            String binary = Integer.toBinaryString(x);

            // prints x in binary format which =10
            System.out.println("The BinaryString value of x is: \t"+binary);

//now shifting x by 2 - this will multiply x 4 since << shifts2 places x2, prints out the decimal value
        x= ( x << 1);
Integer.toBinaryString(x);
            // Predicting the new values after left shift
            // After shifting left by 1, the new value should be 4 (which is 100 in binary)
            // Predicted decimal value: 4
            // Predicted binary string: 100


            System.out.println(x);
            System.out.println("the new x to binary:"+ Integer.toBinaryString(x));
        }
    }



