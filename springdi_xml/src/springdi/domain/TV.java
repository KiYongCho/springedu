package springdi.domain;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class TV {
	
	private Speaker speaker;
	private String name;
	private List<String> parts;
	private Set<String> colors;
	private Map<String, String> yearPrice;
	private Properties spec;
	
	public TV() {
		System.out.println("TV객체가 생성됨!");
	}
	
	/*
	public TV(Speaker speaker, String name, List<String> parts, Set<String> colors, Map<String, String> yearPrice,
			Properties spec) {
		super();
		this.speaker = speaker;
		this.name = name;
		this.parts = parts;
		this.colors = colors;
		this.yearPrice = yearPrice;
		this.spec = spec;
	}
	*/

	public TV(Speaker speaker) {
		this.speaker = speaker;
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getParts() {
		return parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}

	public Set<String> getColors() {
		return colors;
	}

	public void setColors(Set<String> colors) {
		this.colors = colors;
	}

	public Map<String, String> getYearPrice() {
		return yearPrice;
	}

	public void setYearPrice(Map<String, String> yearPrice) {
		this.yearPrice = yearPrice;
	}

	public Properties getSpec() {
		return spec;
	}

	public void setSpec(Properties spec) {
		this.spec = spec;
	}

	@Override
	public String toString() {
		return "TV [speaker=" + speaker + ", name=" + name + ", parts=" + parts + ", colors=" + colors + ", yearPrice="
				+ yearPrice + ", spec=" + spec + "]";
	}
	
}
