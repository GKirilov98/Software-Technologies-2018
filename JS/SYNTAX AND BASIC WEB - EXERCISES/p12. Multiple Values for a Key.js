function MultyValKey(arr) {
    let keyToPrint = arr.pop();
    let dic = new Map();
    for (let argument of arr) {
        let tokens = argument.split(" ");
        let key = tokens[0];
        let value = tokens[1];

        if (!dic.has(key)){
            dic.set(key, []);
        }

        dic.get(key).push(value);
    }

   if (dic.has(keyToPrint)){
        console.log(dic.get(keyToPrint).join('\n'))
   }
   else{
        console.log("None");
   }
}

MultyValKey([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);