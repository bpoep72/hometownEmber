import { module, test } from 'qunit';
import { setupTest } from 'ember-qunit';

module('Unit | Route | events', function(hooks) {
  setupTest(hooks);

  test('index exists', function(assert) {
    let route = this.owner.lookup('route:events/index');
    assert.ok(route);
  });
});
