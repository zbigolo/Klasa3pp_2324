package Sample;



public class Weryfikator {


    public static void main(String[] args) {
        String password = "zaq1@WSX10";
        boolean isNumber = false;
        boolean isUpperCase = false;
        boolean isLowerCase = false;

        boolean wynik;

        if (!password.isEmpty()) {
            if (password.length() >11){
                    for (int i = 0; i < password.length(); i++) {
                        if(Character.isDigit(password.charAt(i))){
                            isNumber = true;
                            continue;
                        }
                        if(Character.isLowerCase(password.charAt(i))){
                            isLowerCase = true;
                            continue;
                        }
                        if(Character.isUpperCase(password.charAt(i))){
                            isUpperCase = true;
                            continue;
                        }
                        System.out.println(i);
                    }
                    System.out.println("isNumber: " + isNumber
                                                + "\n isLowerCase: " + isLowerCase
                                                + "\n isUpper Case    " +   isUpperCase);

                    wynik = isNumber && isUpperCase && isLowerCase;

                    if(wynik)
                        System.out.println("Hasło mocne: " + password   );
                    else
                        System.out.println("Hasło słabe : " + password );
            }
            else
                System.out.println("Słabe hasło : " + password);
        }
        else
            System.out.println("Słabe hasło : "+ password);
    }
}
