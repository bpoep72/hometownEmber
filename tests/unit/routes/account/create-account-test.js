import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | account/create-account', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:account/create-account');
    assert.ok(route);
  });
});
