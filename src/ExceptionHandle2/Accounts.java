package ExceptionHandle2;

class Accounts   {

public  void withdrawal(double amount, double balance)  throws  WithdrwaException , ArithmeticException{


    if (amount > balance) {

        throw new WithdrwaException("Withdrawal Failed");

    } else
        System.out.println("Withdrawal Successful");



    }
}

