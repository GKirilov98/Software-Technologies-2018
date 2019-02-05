function printLines(arr) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === "Stop") {
            break;
        }
        else {
            console.log(arr[i]);
        }
    }
}

printLines([
    'Line 1',
    'Line 2',
    'Line 3',
    'Stop'
]);