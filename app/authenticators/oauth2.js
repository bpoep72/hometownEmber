// app/authenticators/oauth2.js
import OAuth2PasswordGrantAuthenticator from 'ember-simple-auth/authenticators/oauth2-password-grant';

export default OAuth2PasswordGrantAuthenticator.extend({
  serverTokenEndpoint: 'http://localhost:9001/oauth/token'
});