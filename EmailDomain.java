//to check email domain
// @gmail.com   @yahoo.com  @rediffmail.com

class EmailDomain {
    public static void main(String[] args) {
        String email="aakash@tcs.com.in";
        System.out.println("check email = "+email.contains("@tcs.com"));
    System.out.println("check email= "+email.endsWith("@tcs.com"));  
    }
}