package Common;

import java.util.Scanner;

public  class CheckValidate {
private static String regex ="";
private static Scanner sc ;

public static boolean checkNameServies(String str){
    regex ="^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    return str.matches(regex);
}

    public static boolean checkNameCustomer(String str){
        regex ="^([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        return str.matches(regex);
    }
    // Check birthday
    public static boolean checkBirthday(String str){
    regex  = "^(29/02/(2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26]))))$\" +\n" +
            "|^((0[1-9]|1[0-9]|2[0-8])/02/((19|2[0-9])[0-9]{2}))$" +
           "|^((0[1-9]|[12][0-9]|3[01])/(0[13578]|10|12)/((19|2[0-9])[0-9]{2}))$" +
         "|^((0[1-9]|[12][0-9]|30)/(0[469]|11)/((19|2[0-9])[0-9]{2}))$";
            return str.matches(regex);
    }
    public static void checkGender(String content){


            content.trim().toLowerCase().replaceAll("\\s+","");
                for (int i = 0; i <content.length() ; i++) {
                    if (content.charAt(i)==0){
                        content.toUpperCase();
                    }
                }

        }



public static boolean checkEmail(String str){
    regex ="^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    return str.matches(regex);
}
public static double checkDouble(String content,String erMes){
    while(true){
        try {
        Scanner sc = new Scanner(System.in);
            System.out.println(content);
            return sc.nextDouble();

        }catch (Exception e){
            System.out.println(erMes);
        }
    }
}public static int checkInteger(String content, String ErInt){
    while(true){
        try {
        Scanner sc = new Scanner(System.in);
            System.out.println(content);
            return sc.nextInt();

        }catch (Exception e){
            System.out.println(ErInt);
        }
    }
}
}


