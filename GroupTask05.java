public class GroupTask05 {
}

interface WebDriver {
    void open();

    void close();

    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebdriver extends WebDriver, TakesScreenshot {
    void navigate();
}

class ChromeDriver implements RemoteWebdriver {
    String title;
    String url;

    public ChromeDriver(String title, String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public void open() {
        System.out.println("Open Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Chrome");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to " + url);
    }
}

class FirefoxDriver implements RemoteWebdriver {
    String title;
    String url;

    public FirefoxDriver(String title, String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public void open() {
        System.out.println("Open Firefox");
    }

    @Override
    public void close() {
        System.out.println("Close Firefox");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to " + url);
    }
}

class SafariDriver implements RemoteWebdriver {
    String title;
    String url;

    public SafariDriver(String title, String url) {
        this.title = title;
        this.url = url;
    }

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take Screenshot");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to " + url);
    }
}
