class UserDefined extends Exception{

    UserDefined(String str) {
        super(str);
    }

    /*String getMsg(){
        return this.msg;
    }*/

}
class ExceptionHandling {
    static void check(int age) throws UserDefined,ArithmeticException{
        if(age<18){
            throw new UserDefined("Age invalid");
        }
        else {
            throw new ArithmeticException("Age Valid");
        }
    }
    public static void main(String[] args) {
        try {
            check(19);
        }
        catch(UserDefined E){
            System.out.println(E.getMessage());
        }
        catch(ArithmeticException E){
            System.out.println(E.getMessage());
        }


        System.out.println("Hello");

    }


}