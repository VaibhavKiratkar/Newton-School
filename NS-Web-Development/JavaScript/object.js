const studentInfo = {
    Name : "Vaibhav",

    RollNumber : 1234,

    ContactNumber : [9689696540, 9421148795],

    ParentsInfo : {
        Name : "Najukrao",
        ContactNumber : 9421258795
    },

    Greeting : function(){
        console.log("Hello Vaibhav");
    },

    3 : "No use"
}

console.log(studentInfo.Name);
console.log(studentInfo.ContactNumber);
console.log(studentInfo.ContactNumber[0]);
console.log(studentInfo.ParentsInfo.Name);
console.log(studentInfo.Greeting());
console.log("Name" in studentInfo);
console.log(studentInfo[3]);