package models.categoriesresponse;

public class Chart {
	private String caption;
	private boolean genre;
	private Number group;
	private String label;
	private String name;
	private String slug;
	private Translations translations;

	public String getCaption() {
		return this.caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public boolean getGenre() {
		return this.genre;
	}

	public void setGenre(boolean genre) {
		this.genre = genre;
	}

	public Number getGroup() {
		return this.group;
	}

	public void setGroup(Number group) {
		this.group = group;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Translations getTranslations() {
		return this.translations;
	}

	public void setTranslations(Translations translations) {
		this.translations = translations;
	}
}
