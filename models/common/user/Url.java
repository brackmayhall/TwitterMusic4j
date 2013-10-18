package models.common.user;

import java.util.List;

/**
 * holds lists of urls.
 * @author Daniel
 *
 */
public class Url {
	
	private List<Urls> urls;

	public List<Urls> getUrls() {
		return this.urls;
	}

	public void setUrls(List<Urls> urls) {
		this.urls = urls;
	}
}
