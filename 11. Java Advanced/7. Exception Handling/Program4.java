class InvalidBalanceException extends Exception{
    InvalidBalanceException(String message){
        super(message);
    }
}

public class Program4 {
    public static void main(String[] args) {
        int balance;
        try{
            balance = Integer.parseInt(args[0]);
            updateBalance(balance);
            System.out.println("Main method executed succefully");
        }
        catch(InvalidBalanceException ex){
            System.out.println("Caught in catch of InvalidBalanceException");
            ex.printStackTrace();
        }

        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        }

        catch (Exception ex){
            System.out.println("Caught in catch of parent exception");
        }


    }

    static void updateBalance(int number) throws InvalidBalanceException{
        if(number < 0)
            throw new InvalidBalanceException("Account Balance can not be less than zero");
        
        System.out.println("No Exception Occurred in updateBalance()");
    }
}
