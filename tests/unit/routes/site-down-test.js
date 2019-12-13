import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | site-down', function(hooks) {
  setupTest(hooks);

  test('it exists', function(assert) {
    let route = this.owner.lookup('route:site-down');
    assert.ok(route);
  });
});
