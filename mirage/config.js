export default function() {

  this.namespace = '/api';
  this.urlPrefix = '';

  this.get('/events', (schema) => {
    return schema.events.all();
  });

}
