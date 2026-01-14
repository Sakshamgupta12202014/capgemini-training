import java.util.Scanner;

public class LoginAuthentication
{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type username: ");
        String username = sc.next();
        System.out.print("Type password: ");
        String password = sc.next();

        int status_code = login(username, password);
        if (status_code == 200) {
            System.out.println("Login Successfull");
        }else if(status_code == 400){
            System.out.println("Login failed!, invalid credentials");
        }else{
            System.out.println("Server Error");
        }
    }

    static int login(String username, String password) {
        if(
            username.trim().equals("user") && password.trim().equals("*****")
        )
        {
            return 200;
        }
        else if(
            !username.trim().equals("user") && !password.trim().equals("*****")
        ){
            return 400;
        }
        else{
            return 500;
        }
    }
}