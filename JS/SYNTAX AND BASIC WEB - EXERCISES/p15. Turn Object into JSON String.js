function objIntoJSON(arr) {

    let studentInfo = {};
    for (let input of arr) {
        let obj = input.split(' -> ');
        let key = obj[0];
        let value = obj[1];
        if (!isNaN(value)){
            value = Number(obj[1]);
        }
        studentInfo[key] = value;
    }

    console.log(JSON.stringify(studentInfo));
}

objIntoJSON([
    'name -> Angel',
    'surname -> Georgiev',
    'age -> 20',
    'grade -> 6.00',
    'date -> 23/05/1995',
    'town -> Sofia'
]);