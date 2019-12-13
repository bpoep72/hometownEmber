import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | account/recover-account-username', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:account/recover-account-username');
    assert.ok(route);
  });
});
