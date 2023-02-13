import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class ExceptionE {
    public static void main(String[] args) {
        try {
            boolean isSuccess = Login("k82", "11118282");
            if(isSuccess) System.out.println("Login Success");
            else System.out.println("Login Failed");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Copyright g82 2015");
        }
    }
    
    static boolean Login(String id, String pw) throws Exception{
        boolean isNoId = false;
        boolean isPasswordWrong = false;
        boolean isNetworkFailed = true;
        boolean isPWExpired = false;

        if(isNetworkFailed) throw new Exception("Network Failed");
        else if(isNoId) throw new Exception("user ID no Exist");
        else if(isPWExpired) throw new Exception("Need change password");
        else if(isPasswordWrong) throw new Exception("Password Wrong");

        return true;
    }
}
