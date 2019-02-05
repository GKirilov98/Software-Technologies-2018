function sumThreeIntegers(arr) {
    let nums = arr[0].split(' ');
    let num1 = Number(nums[0]);
    let num2 = Number(nums[1]);
    let num3 = Number(nums[2]);
    console.log(sum(num1, num2, num3) ||
        sum(num2, num3, num1) ||
        sum(num3, num1, num2) || 'No');


    function sum(firstnum, secondnum, sum) {
        if (firstnum + secondnum !== sum) {
            return false;
        }
        else {
            return `${Math.min(firstnum, secondnum)} + ${Math.max(firstnum, secondnum)} = ${sum}`;
        }
    }
}

sumThreeIntegers(['8, 15, 7']);
