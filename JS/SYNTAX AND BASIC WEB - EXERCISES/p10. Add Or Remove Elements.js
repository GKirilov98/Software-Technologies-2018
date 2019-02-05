function addOrRemove(arr) {
    let massive = [];
    for (let i = 0; i < arr.length; i++) {
        let element = arr[i].split(' ').filter(e => e != '');
        let command = element[0];
        switch (command) {
            case "add":
                massive.push(element[1]);
                break;
            case "remove":
                let index = Number(element[1]);
                if (index < 0){
                    continue;
                }
                massive.splice(index,1);
                break;
        }
    }
   console.log(massive.join('\n'));
}

addOrRemove([
   ' add 3',
   ' add 5',
   ' add 7'
]);