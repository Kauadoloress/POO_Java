public class Main {
    public static void main(String[] args) {
        LoginLocal loginLocal = new LoginLocal();
        LoginLDAP loginLDAP = new LoginLDAP();

        loginLocal.autenticar("Kael", "1234");
        loginLDAP.autenticar("Lloyd","2345");

        System.out.println(loginLDAP.autenticar("Lloyd","2345"));
        System.out.println(loginLocal.autenticar("Kael", "1234"));
    }
}
