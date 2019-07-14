package com.example.twilio.TwilioIntegrationDemo;

import com.twilio.twiml.VoiceResponse;
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
		Say greeting = new Say.Builder("Hello caller number : " + callerNumber.incrementAndGet()).build();

		return voiceBuilder.say(greeting).build().toXml();
	}
}
