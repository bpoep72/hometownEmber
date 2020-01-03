import Controller from '@ember/controller';
import { inject as service } from '@ember/service';

export default Controller.extend({
    session: service(),

    actions: {
        async authenticate() {
            let username = this.getProperties('username');
            let password = this.getProperties('password');
            try {
                await this.session.authenticate('authenticator:oauth2', username, password);
            }
            catch(error) {
                this.set('errorMessage', error.error || error);
            }
        }
    }
});
