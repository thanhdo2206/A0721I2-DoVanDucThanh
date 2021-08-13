//bai 1
let a = parseFloat(prompt("nhập a:"));
let b = parseFloat(prompt("nhập b:"));

if( a % b == 0) alert("a chia hết cho b");
else alert("a không chia hết cho b");

//bai 2

let age = parseInt(prompt("nhập tuổi: "));
if(age >= 16) alert("bạn đủ điều kiện học lớp 10");
else alert("bạn không đủ điều kiện học lớp 10");

//bai  3
let number = parseInt(prompt("nhập số: "));
if(number > 0 ) alert(`số ${number} lớn hơn 0`);
else alert(`số ${number} nhỏ hơn 0`);

//bai 4
let a = parseFloat(prompt("nhập a:"));
let b = parseFloat(prompt("nhập b:"));
let c = parseFloat(prompt("nhập c:"));

if(a>b && a > c) alert(`${a} lớn nhất`);
else if(b>c) alert(`${b} lớn nhất`);
else alert(`${c} lớn nhất`);

//bai 5
let pointMid = parseFloat(prompt("nhập điểm giữa kỳ:"));
let pointEnd = parseFloat(prompt("nhập điểm cuối kỳ:"));
let avg = (pointMid  + pointEnd ) / 2;
if(avg >= 9) alert("Học sinh giỏi");
else if( avg >=7) alert("Học sinh khá");
else alert("Học sinh trung bình");

//bai 6
let sale = parseFloat(prompt("nhập doanh số:"));
if (sale <= 100) poundage = sale * 5 / 100;
else if (sale <= 300) poundage = sale * 10 / 100;
else poundage = sale * 20 / 100;

alert(`tiền hoa hồng với tổng doanh thu ${sale} là: ${poundage}`);


//bai 7
let minute = parseFloat(prompt("nhập số phút:"));
const charge = 25;
if(minute > 200) money = (minute - 200) * 200 + 150 * 400 + 50 * 600;
else if(minute > 50) money = (minute - 50) * 400 + 50 * 600;
else money = minute * 600;

sum = 0.01 *money + charge;