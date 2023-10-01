// input: this is sunny day
function reverseWord(sentence){
    return (sentence.split(' ').map((word)=>word.split('').reverse().join(''))).join(' ');
}
let sentence="This is sunny day"
console.log(reverseWord(sentence));