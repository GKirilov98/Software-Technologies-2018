function solve(arr) {
    let nums = arr.map(Number).sort((a,b) => b - a);
    if (nums.length < 3){
        for (let i = 0; i < nums.length; i++) {
            console.log(nums[i]);
        }
    }
    else {
        for (let i = 0; i < 3; i++) {
            console.log(nums[i]);
        }
    }
}

solve(['10', '30', '15', '20', '50', '5']);