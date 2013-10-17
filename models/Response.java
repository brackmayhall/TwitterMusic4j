package models;
import java.util.List;

public class Response{
   	private Chart chart;
   	private String published;
   	private List<Tracks> tracks;

 	public Chart getChart(){
		return this.chart;
	}
	public void setChart(Chart chart){
		this.chart = chart;
	}
 	public String getPublished(){
		return this.published;
	}
	public void setPublished(String published){
		this.published = published;
	}
 	public List<Tracks> getTracks(){
		return this.tracks;
	}
	public void setTracks(List<Tracks> tracks){
		this.tracks = tracks;
	}
}
