
import Component from '@ember/component';

export default Component.extend({
  classNames: ['event-item'],
  actions:
  {
    loadEvent() {
      alert("clicked");
    }
  }
});
