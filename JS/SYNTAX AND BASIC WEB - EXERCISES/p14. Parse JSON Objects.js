function parseJSONobjdect(arr) {

    let peoples = [];
    for (let i = 0; i < arr.length; i++) {
        let input = JSON.parse(arr[i]);
        let name = input.name;
        let age = input.age;
        let date = input.date;
        let person = {};
        person['name'] = name;
        person['age'] = age;
        person['date'] = date;
        peoples.push(person);
    }
    for (let people of peoples) {
        console.log(`Name: ${people.name}\nAge: ${people.age}\nDate: ${people.date}`)
    }
}

parseJSONobjdect([
    '{"name":\"Gosho","age":10,"date":"19/06/2005"}',
    '{"name":"Tosho","age":11,"date":"04/04/2005"}'
]);