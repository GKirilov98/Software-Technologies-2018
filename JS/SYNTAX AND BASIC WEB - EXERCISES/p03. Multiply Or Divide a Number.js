function divideOrMulty(arr) {
    let n = Number(arr[0]);
    let x = Number(arr[1]);

    if (x >= n) {
        return x * n;
    }
    else {
        return n / x;
    }
}