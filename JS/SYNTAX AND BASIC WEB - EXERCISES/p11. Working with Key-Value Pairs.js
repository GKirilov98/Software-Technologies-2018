function printKey(arr) {
    let keyToPrint = arr[arr.length - 1];
    let dictionary = {};

    for (let i = 0; i < arr.length - 1; i++) {
      let tokens = arr[i].split(' ').filter(e => e !== '');
      let key = tokens[0];
      let vale = tokens[1];
          dictionary[key] = vale;
    }

    if (dictionary.hasOwnProperty(keyToPrint)){
        console.log(dictionary[keyToPrint]);
    }
    else {
        console.log("None")
    }



}

printKey([
    'key value',
    'key eulav',
    'test tset',
    'key'
]);