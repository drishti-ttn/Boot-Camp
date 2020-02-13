// ques 5.1
var emp= [
    { name: "Drishti", age:23,salary:5000,dob:"07-10-1996"},
    { name: "Nisha", age:22,salary:5500,dob:"07-01-1997"},
    { name: "Prabhat", age:22,salary:600,dob:"21-07-1995"},
    { name: "Shreya", age:24,salary:5800,dob:"06-10-1995"}
];
console.log(emp);

//ques 5.2
var emps=emp.filter(function(items1){
    return (items1.salary>=5000);
});
console.log(emps);

//ques5.3
var result=_.groupBy(emp,function(employee){
    return employee.age;
});
console.log(result);

//ques 5.4
var inc=emp.filter(function(items1){
    return (items1.salary<1000 && items1.age>20)
});
console.log(inc);

var result=inc.map(x=>{x.salary;
var arr={}
arr[x.salary]=x.salary*5;
return arr;
});
console.log(result);