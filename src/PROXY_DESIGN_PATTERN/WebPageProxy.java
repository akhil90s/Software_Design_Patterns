package PROXY_DESIGN_PATTERN;

public class WebPageProxy implements WebPage{
	
	WebPage webPage;
	
	public WebPageProxy() {
		webPage = new WebPageImpl();
	}
	
	@Override
	public void renderPage(String url) throws Exception {
		if (url.equalsIgnoreCase("www.youtube.com")) {
			throw new Exception("URL not allowed");
		} else {
			webPage.renderPage(url);
		}
	}

}
