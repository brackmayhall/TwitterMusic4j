package models.tracksresponse;

/**
 * the tracks response class.
 * @author Daniel
 *
 */
public class TracksResponse {
	/** the response from the request. */
   	private Response response;

   	/**
   	 * gets the response.
   	 * @return the response class.
   	 */
 	public final Response getResponse() {
		return this.response;
	}
 	
 	/**
 	 * sets the response.
 	 * @param response the response.
 	 */
	public final void setResponse(final Response response) {
		this.response = response;
	}
}
