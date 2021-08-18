let numbers = parseInt(prompt("nhập số nguyên N"));
let count = 0;
let N = 2;

for (let i = N; i > 0; i++) {
    if (count == numbers) break;
    else {
        if (isPrime(i)) {
            count++;
            document.writeln(i);
        };
    }
}

function isPrime(n){
    let check = 0;
    for(let i = 2; i <= Math.sqrt(n);i++){
        if(n%i == 0) check++;
    }
    if(check == 0) return true;
    else return false;
}