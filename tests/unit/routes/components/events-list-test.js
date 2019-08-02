import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | components/events-list', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:components/events-list');
    assert.ok(route);
  });
});
