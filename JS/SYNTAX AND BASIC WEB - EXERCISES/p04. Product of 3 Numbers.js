function prodof3Num(arr){
    count = 0;
    for (let num of arr) {
        if (Number(num) < 0){
            count ++;
        }
    }

    if (count %2 == 0){
        console.log("Positive")
    }
    else {
        console.log("Negative")
    }
}

    
}