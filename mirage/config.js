export default function() {

  this.namespace = '';
  this.urlPrefix = '';

  this.get('/events', (schema, request) => {
    return schema.events.all();
  });
  
}
