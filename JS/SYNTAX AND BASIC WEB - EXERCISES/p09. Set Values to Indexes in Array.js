function setValueIndex(arr){
    let length = Number(arr[0]);
    let massive = {};
    for (let i = 0; i < length; i++) {
        massive[i] = 0;
    }

    for (let i = 1; i < arr.length; i++) {
        let num = arr[i].split(' - ').map(Number);
        massive[num[0]] = num[1];
    }
    for (let i = 0; i < length; i++) {
       console.log(massive[i]);
    }
}
setValueIndex([
    '3',
    '0 - 5',
    '2 - 7',
    '1 - 6'
]);
