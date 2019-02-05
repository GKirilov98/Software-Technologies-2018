function storingObjects(arr){

    let students = [];
    for (let i = 0; i < arr.length; i++) {
        let input = arr[i].split(' -> ').filter(e => e !='');
        let name = input[0];
        let age = input[1];
        let grade = input [2];
        let studentInfo = {};
        studentInfo['Name'] = name;
        studentInfo['Age'] = age;
        studentInfo['Grade'] = grade;

        students.push(studentInfo);
    }

    for (let student of students) {
        console.log(`Name: ${student.Name}\nAge: ${student.Age}\nGrade: ${student.Grade}`);
    }
}

storingObjects([
'Pesho -> 13 -> 6.00',
'Ivan -> 12 -> 5.57',
'Toni -> 13 -> 4.90'
]);