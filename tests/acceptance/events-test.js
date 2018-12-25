import { module, test } from 'qunit';
import { visit, currentURL } from '@ember/test-helpers';
import setupMirage from 'ember-cli-mirage/test-support/setup-mirage';
import { setupApplicationTest } from 'ember-qunit';

module('Acceptance | events', function(hooks) {
  setupApplicationTest(hooks);
  setupMirage(hooks);

  test('visiting /events', async function(assert) {
    await visit('/events');

    assert.equal(currentURL(), '/events');
  });
});
