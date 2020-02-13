function calculate(){
    var p,roi,t;
    p=prompt("Enter Principle Amount");
    roi=prompt("Enter Rate Of Interest");
    t=prompt("Enter Time In Years");
    var si= (p*roi*t)/100;
    result=document.getElementById("result");
    result.innerHTML=("The Simple Interest is " + si);
}