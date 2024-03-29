package com.example.twilio.TwilioIntegrationDemo;

import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.voice.Play;
import com.twilio.twiml.voice.Say;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class WebhookController {

	private AtomicInteger callerNumber = new AtomicInteger();

	@GetMapping(value = "/call", produces = "application/xml")
	public String respondToCall() {
		VoiceResponse.Builder voiceBuilder = new VoiceResponse.Builder();
		Say greeting = new Say.Builder("Hey there, thanks for calling. enjoy your music now").build();
		Play play = new Play.Builder("https://regalia-hippopotamus-7841.twil.io/assets/Shawn%20Mendes%2C%20Camila%20Cabello%20-%20Sen%CC%83orita%20(Lyrics)-128.mp3").build();

		return voiceBuilder.say(greeting).play(play).build().toXml();
	}
}
