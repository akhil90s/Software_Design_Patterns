package PROXY_DESIGN_PATTERN;

public class WebPageImpl implements WebPage{

	@Override
	public void renderPage(String url) {
		System.out.println(url + " is rendered");
	}
	

}
