package MEMENTO_DESIGN_PATTERN;

public class Orginator {

	private String article;
	
	public Orginator() {}
	
	public void setArticle(String article) {
		this.article = article;
	}
	
	public String getArticle() {
		return this.article;
	}
	
	public Memento save() {
		return new Memento(article);
	}
	
	public void restore(Memento memento) {
		this.article = memento.getState();
	}
}
