
//bai 1 : tinh diem trung binh
let physics;
let chemistry;
let biological;
physics = prompt("nhap diem vat ly : ");
chemistry = prompt("nhap diem hoa hoc:");
biological = prompt("nhap diem sinh hoc:");

let ly = parseInt(physics);
let hoa = parseInt(chemistry);
let sinh = parseInt(biological);

let pointAverage = (ly + hoa + sinh) / 3 ;
document.write("The average is: " +  pointAverage );



// bai 2 : doi nhiet do

let temperature = prompt("nhap nhiet do (oC)");
let oC = parseInt(temperature);
let oF = (9 * oC /5) + 32;
document.write("oF =  " +  oF);

//bai 3 : dien tich va chu vi hinh tron
let radius = prompt("nhap ban kinh hinh tron");
let R = parseInt(radius);
let chu_vi = 2*3.14*R;
let dien_tich = 3.14 * Math.pow(R,2);
document.write("chu vi la " +  chu_vi);
document.write("dien tich la " +  dien_tich);
