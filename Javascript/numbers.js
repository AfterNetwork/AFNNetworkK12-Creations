let thing = 0;
let numb = 0;
function generateRandom(number) {
 numb = number;
 thing = Math.floor(Math.random() * number);
 return thing
}
console.log(generateRandom(22))
while (thing != numb) {
  console.log(generateRandom(22))
}
