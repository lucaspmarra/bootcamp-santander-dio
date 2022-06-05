function soma(a, b) {
    return a + b;
}

soma(3, 5);
console.log(`Resultado da soma: ${soma(3, 5)}\n`);

function returnEvenValues(array) {
    let evenNums = [];
    for (let index = 0; index < array.length; index++) {
        if (array[index] % 2 === 0) {
            evenNums.push(array[index])
        } else {
            console.log(`${array[index]} não é par.`)
        }
    }
    console.log(`${evenNums} são par.`);
}

let array = [1, 2, 3, 4, 5, 6, 7, 9, 10]
returnEvenValues(array)


var currentNumberWrapper = document.getElementById("currentNumber");
var currentNumber = 0;
function increment() {
    currentNumber = currentNumber + 1;
    currentNumberWrapper.innerHTML = currentNumber;
}
function decrement() {
    currentNumber = currentNumber - 1;
    currentNumberWrapper.innerHTML = currentNumber;
}