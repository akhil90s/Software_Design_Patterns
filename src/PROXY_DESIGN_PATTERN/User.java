package PROXY_DESIGN_PATTERN;

public class User {

	public static void main(String[] args) {
		
		WebPageProxy webPageProxy = new WebPageProxy();
		try {
			webPageProxy.renderPage("www.youtube.com");
		} catch (Exception e) {
			System.out.println("Exception occured " + e.getMessage());
			e.printStackTrace();
		}
		
	}

}
