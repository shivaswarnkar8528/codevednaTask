//perform sorting in decending order

function decendingOrder(arr){
    return arr.sort((a,b)=>b-a);
}
//this is my input
let inputArr=[1,4,67,0,6,3,7,4,7,34];
//using function here
console.log(decendingOrder(inputArr));
