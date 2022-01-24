// function showFunctionality(){
//     alert("This is an alert");
// }


// function showFunctionality(){
//     confirm("This is an alert with ok and cancel button");
// }


function showFunctionality(){
    const userInput = prompt("Taake the user input for prompt");

    const demoDiv = document.getElementById("demo");
    demoDiv.textContent = userInput;
}