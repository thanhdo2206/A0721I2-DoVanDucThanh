

// lấy ô input
let money = document.getElementById('money');
let moneyFrom = document.getElementById('money_from');
let moneyTo = document.getElementById("money_to");
let btn= document.getElementById('btn');
let  convert=document.getElementById('money_converted');


btn.addEventListener('click',(event)=>{

    //lấy giá trị ô input
    var amount = parseFloat(money.value);
    console.log(amount);

    //lấy giá trị select
    var moneyFirst = moneyFrom.value;
    var moneySecond = moneyTo.value;

    if(moneyFirst === moneySecond){
        convert.innerText="No Data";
    }else{
        if(moneyFirst=="VietNam"){
            convert.innerText= `${amount*0.0000436540} USD`;
        }else{
            convert.innerText= `${amount*22907.39} VND`;
        }
    }

})
