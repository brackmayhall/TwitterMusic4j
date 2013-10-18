package models.common.tracks;

/**
 * source of twitter music track.
 * 
 * @author Daniel
 * 
 */
public class Sources {

	private String buy;
	private Number duration;
	private String id;
	private String image;
	private String share;
	private String source;
	private String source_id;
	private String track_name;
	private String url;

	public String getBuy() {
		return this.buy;
	}

	public void setBuy(String buy) {
		this.buy = buy;
	}

	public Number getDuration() {
		return this.duration;
	}

	public void setDuration(Number duration) {
		this.duration = duration;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getShare() {
		return this.share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSource_id() {
		return this.source_id;
	}

	public void setSource_id(String source_id) {
		this.source_id = source_id;
	}

	public String getTrack_name() {
		return this.track_name;
	}

	public void setTrack_name(String track_name) {
		this.track_name = track_name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
