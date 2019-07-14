# Twilio Programmable Voice Integration Demo
Below project demonstrates how to create a webhook by using spring boot
which is being called from Twilio voice.

## Technologies
- Spring Boot app deployed in Heroku (Need a Heroku trial account to deploy this)
- A Twilio trial account (To get a phone number to verify integration & interaction)

## How to Deploy
- Create a Spring Boot project from https://start.spring.io/ or clone this GitHub project to start with the app.
- The app can be deployed to local and by using https://ngrok.com/ app can be exposed with public ip.
   However, I preferred to deploy to ```Heroku```. Refer the below #1 link from
   References section to follow how to deploy.
- After deployment, Head to https://www.twilio.com with the login credentials
  to setup the phone number and configure the webhook url which Twilio programmable
  voice will make a call once receive a call (make sure the caller phone number is verified).
- Finally, make a call from the ```verified``` phone number to Twilio to see the magic.       

## References
- https://devcenter.heroku.com/articles/deploying-spring-boot-apps-to-heroku
- https://www.twilio.com/blog/coding-twilio-webhooks-in-java-with-spring-boot
- https://start.spring.io/