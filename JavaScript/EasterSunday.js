// David Murphy
// 09/10/17
// CSC 103
// HW #1

// step 1 - input
let y = prompt("Enter the year: ");
console.log("y = " + y);
// step 2
let a = y%19;
console.log("a = " + a);
// step 3
let b = Math.trunc(y/100);
console.log("b = " + b);
let c = y%100;
console.log("c = " + c);
// step 4
let d = b/4;
console.log("d = " + d);
let e = b%4;
console.log("e = " + e);
// step 5
let g = Math.trunc((8*b+13)/25);
console.log("g = " + g);
// step 6
let h = Math.trunc((19*a+b-d-g+15)%30);
console.log("h = " + h);
// step 7
let j = Math.trunc(c/4);
console.log("j = " + j);
let k = c%4;
console.log("k = " + k);
// step 8
let m = Math.trunc((a+11*h)/319);
console.log("m = " + m);
// step 9
let r = Math.trunc((2*e+2*j-k-h+m+32)%7);
console.log("r = " + r);
// step 10
let n = Math.trunc((h-m+r+90)/25);
console.log("n = " + n);
// step 11
let p = Math.trunc((h-m+r+n+19)%32);
console.log("p = " + p);
// output
alert("Easter Sunday Date for " + y + ": " + n + "/" + p);