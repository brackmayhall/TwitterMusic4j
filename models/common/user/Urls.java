package models.common.user;

import java.util.List;

/**
 * entity urls.
 * @author Daniel
 *
 */
public class Urls {
	
	private String display_url;
	private String expanded_url;
	private List<Number> indices;
	private String url;

	public String getDisplay_url() {
		return this.display_url;
	}

	public void setDisplay_url(String display_url) {
		this.display_url = display_url;
	}

	public String getExpanded_url() {
		return this.expanded_url;
	}

	public void setExpanded_url(String expanded_url) {
		this.expanded_url = expanded_url;
	}

	public List<Number> getIndices() {
		return this.indices;
	}

	public void setIndices(List<Number> indices) {
		this.indices = indices;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
