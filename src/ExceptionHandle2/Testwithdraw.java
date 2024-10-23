package ExceptionHandle2;

public class Testwithdraw {
    public static void main(String[] args) {
        Accounts acc = new Accounts();
        try {

            acc.withdrawal(10000, 9000);

        }
        catch (WithdrwaException e) {
            System.err.println(e);

            {

            }

        }}}

