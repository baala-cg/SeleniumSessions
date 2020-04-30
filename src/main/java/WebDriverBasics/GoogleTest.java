package WebDriverBasics;

public class GoogleTest {

	public static void main(String[] args) {
		BrowserActions br = new BrowserActions();
		
		br.launchBrowser("chrome");
		
		br.launchUrl("http://www.google.com");
		System.out.println(br.doGetTitle());
		
		if(br.doGetTitle().equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		
	}

}
