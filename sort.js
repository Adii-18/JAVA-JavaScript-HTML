function sortDescending(arr) {
    arr.sort((a, b) => b - a);
}

let numbers = [5, 2, 9, 1, 5, 6];

sortDescending(numbers);

console.log(numbers);
