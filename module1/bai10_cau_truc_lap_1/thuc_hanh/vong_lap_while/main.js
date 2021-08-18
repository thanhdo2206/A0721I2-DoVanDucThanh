let num = parseInt(prompt("Enter a number: "));
let total = 0;
 while (num != -1){

     alert(num);
     total += num;
     num = parseInt(prompt("Enter a number: "));

 }

alert(total);

//bai 2
let i = 1;

while (i < 100) {
    //phân thân vòng lặp
    document.write("<hr width = " + i + "%>");
    i++;
}