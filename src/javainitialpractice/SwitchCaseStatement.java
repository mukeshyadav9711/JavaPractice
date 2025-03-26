package javainitialpractice;

public class SwitchCaseStatement {

    public static void main(String[] args) {
        String browser = "ie";
        switch (browser.toLowerCase().trim()) {
            case "chrome":
                System.out.println("Launch chrome");
                break;
            case "firefox":
                System.out.println("launch firefox");
                break;
            default:
                System.out.println("Please enter correct browser");

        }
    }
}
