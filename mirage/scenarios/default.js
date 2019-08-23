export default function(server) {

  server.createList('hour', 7);
  
  server.createList('game', 4).forEach(function(game) {
    server.createList('event', 4, { game });
  });

}
