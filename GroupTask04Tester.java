public class GroupTask04Tester {
    public static void main(String[] args) {
        Registration registration1 = new Registration();
//        registration1.setEmail("john");
//        registration1.setUserName("john");
//        registration1.setPassword("john1");
        registration1.setEmail("john@yahoo.com");
        registration1.setUserName("john1988");
        registration1.setPassword("password1");
        System.out.println(registration1.getEmail());
        System.out.println(registration1.getUserName());
        System.out.println(registration1.getPassword());
    }
}
