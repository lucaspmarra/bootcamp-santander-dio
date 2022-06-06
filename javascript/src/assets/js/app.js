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

// Counter
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

const form = document.getElementById('task-form');
const taskList = document.getElementById('tasks');

form.onsubmit = function (e) {
	e.preventDefault();
	const inputField = document.getElementById('task-input');
	addTask(inputField.value);
	form.reset();
};

// To-Do List
function addTask(description) {
	const taskContainer = document.createElement('div');
	const newTask = document.createElement('input');
	const taskLabel = document.createElement('label');
	const taskDescriptionNode = document.createTextNode(description);

	newTask.setAttribute('type', 'checkbox');
    newTask.setAttribute('name', description);
	newTask.setAttribute('id', description);

	taskLabel.setAttribute('for', description);
	taskLabel.appendChild(taskDescriptionNode);

	taskContainer.classList.add('task-item');
	taskContainer.appendChild(newTask);
	taskContainer.appendChild(taskLabel);

	taskList.appendChild(taskContainer);
}