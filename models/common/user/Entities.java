package models.common.user;

/**
 * entities associated with a user.
 * 
 * @author Daniel
 * 
 */
public class Entities {

	private Description description;
	private Url url;

	public Description getDescription() {
		return this.description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	public Url getUrl() {
		return this.url;
	}

	public void setUrl(Url url) {
		this.url = url;
	}
}
