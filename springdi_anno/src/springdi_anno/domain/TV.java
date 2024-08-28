package springdi_anno.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class TV {
	
	@Autowired
	@Qualifier("lgspeaker")
	//@Qualifier("samsungspeaker")
	private Speaker speaker;

	public TV() {
		System.out.println("TV객체가 생성됨!");
	}

	public Speaker getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	
}
