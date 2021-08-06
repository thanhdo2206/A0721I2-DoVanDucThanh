var $ = document.querySelector.bind(document);
var $$ = document.querySelectorAll.bind(document);

let money = $('#money');
let moneyFrom = $('#money_from');
let moneyTo = $("#money_to");
let btn= $('.btn');
let form = $('form');
let  convert=$('.money_converted');


btn.addEventListener('click',(event)=>{

    var amount = parseInt(money.value);
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
