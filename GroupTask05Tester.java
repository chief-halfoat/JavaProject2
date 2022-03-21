public class GroupTask05Tester {

    public static void main(String[] args) {
        RemoteWebdriver[] remoteWebdrivers = {new ChromeDriver("ESPN", "https://www.espn.com"),
                new FirefoxDriver("ESPN", "https://www.espn.com"), new SafariDriver("ESPN", "https://www.espn.com")};

        for (RemoteWebdriver remoteWebdriver : remoteWebdrivers) {
            remoteWebdriver.open();
            remoteWebdriver.navigate();
            System.out.println(remoteWebdriver.getTitle());
            remoteWebdriver.getScreenshot();
            remoteWebdriver.close();
            System.out.println("*********************************************");
        }

    }
}
