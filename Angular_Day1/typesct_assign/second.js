var arr = [10, 20, 30, 40, 50];
var num = 20;
var flag = false;
for (var i = 0; i < arr.length; i++) {
    if (num === arr[i]) {
        flag = true;
        console.log('the number is present at:' + i);
    }
}
if (flag === false) {
    console.log('the number is not present in the array');
}
