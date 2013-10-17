import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import models.TwitMusicMap;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class TwitMusicMapper {
	
	public static final String BASE_URL = "https://music.twitter.com/app/";
	
	private static Gson gson = new Gson();
	
	private static HttpClient client = new DefaultHttpClient();
	
	public TwitMusicMap executeChartGet(String endpointRequest)
	{
		TwitMusicMap twitMusicMap = null;
		HttpGet get;
		
		try {
			get = new HttpGet(BASE_URL+endpointRequest);
	        HttpResponse response = client.execute(get);
	        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

	        String line = "";
	        while ((line = rd.readLine()) != null) {
	        	twitMusicMap = gson.fromJson(line, TwitMusicMap.class);
	        }
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} catch (JsonSyntaxException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return twitMusicMap;
	}
	
}
