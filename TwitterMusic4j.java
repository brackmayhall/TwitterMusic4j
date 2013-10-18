import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import models.artistresponse.ArtistResponse;
import models.categoriesresponse.CategoriesResponse;
import models.similarresponse.SimilarArtistsResponse;
import models.tracksresponse.TracksResponse;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import util.Endpoint;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * the twittermusic4j api.
 * @author Daniel
 * 
 */
public class TwitterMusic4j {

	/** pojo mapper. */
	private static Gson gson = new Gson();

	/** client for all http requests. */
	private static HttpClient client = new DefaultHttpClient();

	/** used to get endpoints for requests. */
	private Endpoint endpoint = new Endpoint();

	/**
	 * Requests music information by categories specified by the endpoint used.
	 * @param endpointRequest the twitter music endpoint at which to hit
	 * @return a response based on the requested category
	 */
	public final CategoriesResponse executeCategoriesGet(
			final String endpointRequest) {
		CategoriesResponse categoriesResponse = null;
		HttpGet get;

		try {
			get = new HttpGet(endpointRequest);
			HttpResponse response = client.execute(get);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				categoriesResponse = gson.fromJson(line,
						CategoriesResponse.class);
			}
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return categoriesResponse;
	}

	/**
	 * Requests twitter music artist information.
	 * @param name the name of the artist
	 * @return a response based on the supplied artist name
	 */
	public final ArtistResponse getArtist(final String name) {

		String url = this.endpoint.ARTIST.replaceAll("\\{artistName\\}",
				name.toLowerCase() + "");
		ArtistResponse artistResponse = null;
		HttpGet get;

		try {
			get = new HttpGet(url);
			HttpResponse response = client.execute(get);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				artistResponse = gson.fromJson(line, ArtistResponse.class);
			}
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return artistResponse;
	}

	/**
	 * Requests twitter music similar artists based on a single artist.
	 * @param id the id of the artist. Get this with another method.
	 * @return a response of similar artists.
	 */
	public final SimilarArtistsResponse getSimilarArtists(final String id) {
		String url = this.endpoint.SIMILAR_ARTISTS.replaceAll("\\{artistId\\}",
				id + "");
		SimilarArtistsResponse similarArtists = null;
		HttpGet get;

		try {
			get = new HttpGet(url);
			HttpResponse response = client.execute(get);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				similarArtists = gson.fromJson(line,
						SimilarArtistsResponse.class);
			}
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return similarArtists;
	}

	/**
	 * Reuests a list of tracks for a given artist.
	 * @param id the id of the artist.
	 * @return a response of artist based track information.
	 */
	public final TracksResponse getArtistTracks(final String id) {
		String url = this.endpoint.ARTIST_TRACKS.replaceAll("\\{artistId\\}",
				id + "");
		TracksResponse tracksResponse = null;
		HttpGet get;

		try {
			get = new HttpGet(url);
			HttpResponse response = client.execute(get);
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				tracksResponse = gson.fromJson(line, TracksResponse.class);
			}
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return tracksResponse;
	}

}
