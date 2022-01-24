// const demo = document.getElementById("demo");
// demo.style.border = "solid 1px red";

// function printValue(){
//     console.log("Hello");
//     console.log("Vaibhav");
// }
// const id = setInterval(printValue, 1000) //(funtion, time in milliseconds)
// clearInterval(id, printValue) //(uniqueid, function name)

function animateBall(){
    const ball = document.getElementById("demo");

    let topPosition = 10;

    const stopInterval = setInterval(moveBall, 3);

    function moveBall(){

        if(topPosition <= 200){
            topPosition += 1;    
            ball.style.top = topPosition + 'px';
        } else {
            clearInterval(stopInterval, moveBall);
        }
    }
}

animateBall();

// document.getElementById("demo") ==> returns the item with that id name
// document.getElementsByClassName("demo") ==> returns the array of an item with that className
// document.getElementsByTagName("div") ==> returns the array of an item with that tagName
// document.querySelector(".demo") ==> returns the first item with the className
// documnet.querySelectorAll(".demo") ==>retruns the array of all the items with that className