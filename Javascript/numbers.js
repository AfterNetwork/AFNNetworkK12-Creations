let thing = 0;
function NetworkJS.random(number) {
  for (thing != number) {
    thing = Math.floor(Math.random * number);
    return thing
  }
}
console.log(NetworkJS.random(50));
