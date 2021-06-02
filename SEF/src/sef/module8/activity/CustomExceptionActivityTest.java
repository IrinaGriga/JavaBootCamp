package sef.module8.activity;
//Needs to be completed
//This program accepts a user name and checks user's validity
//The user name is checked against an array of names.

public class CustomExceptionActivityTest {
   static boolean ValidateUser (String userName) {

       //array of names
       String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

       for (int i = 0; i < 4; i++) {
           String name11 = validUsers[i];
           if (userName == name11) {
               return true;
           }
       }
       return false;


   }

    public static void main(String[] args) throws CustomExceptionActivity {

        //flag stores 1 if a match is found else it should remain 0

        //2 - Write code to check if parameter name contains a value which is found in validUsers array and
        // change flag's value accordingly

        //3 - check if flag is zero, throw CustomExceptionActivity Exception.
        //You may also have to declare this exception in the method call using throws.


        //4 - else if flag is one, print a message "Welcome to Payroll program".

        String[] names = {"John", "Goga", "John", "Eva"};
        for (int i = 0; i < 4; i++) {
            int flag = 0;
            if (ValidateUser(names[i])) {
                flag = 1;
            }
            if (flag == 0) {
                throw new CustomExceptionActivity();
            }
            if (flag == 1){
                System.out.println("Welcome to Payroll program " + names[i]);
            }
        }




        //1 - Type main method and call validateUser() from it.
        //Call this method with different names to test it


        //void validateUser (String name)}




    }
}
