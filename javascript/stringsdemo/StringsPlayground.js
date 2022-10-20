// Declaration
let myName = "Pablo Pérez";
console.log("Hola " + myName);
// Split
let mySplittedName = myName.split(' ');
console.log("Hola " + mySplittedName[0]);
// Lower case
let sentence = "THIS SHOULD BE DISPLAYED WITH LOWER CASE";
console.log(sentence.toLowerCase());
// Upper case
let lowerSentence = "this will be displayed in upper case";
console.log(lowerSentence.toUpperCase());
// Trim
let sentenceWithSpaces = "       Test trim string        ";
console.log(sentenceWithSpaces.trim());
// Length
console.log(sentenceWithSpaces.length);

// String compare (taken from https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Equality)
console.log('\nString comparision:');

console.log('hello' == 'hello');
// expected output: true

console.log('1' ==  1);
// expected output: true

console.log(0 == false);
// expected output: true


// Conversions
console.log(Math.PI.toFixed(4));
console.log(Math.PI.toString());
floatVal = parseFloat("321.23") + 20;
console.log(floatVal);
intVal = parseInt("321.23") + 20;
console.log(floatVal);