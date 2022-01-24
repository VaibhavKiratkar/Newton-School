const demoElement = document.getElementById("demo");

// demoElement.innerHTML = "<h1>Hello Vaibhav</h1>"


// const textDiv = document.createElement("div");
// textDiv.textContent = "Hello Vaibhav"
// demoElement.appendChild(textDiv);

// demoElement.style.backgroundColor = "grey";
// textDiv.style.fontSize = "500%"
// textDiv.style.color = "white";

let counter = 1;
function createText(){
    if (counter <= 1){        
        const textDiv = document.createElement("div");
        textDiv.textContent = "Hello Vaibhav"
        demoElement.appendChild(textDiv);

        demoElement.style.backgroundColor = "grey";
        textDiv.style.fontSize = "500%"
        textDiv.style.color = "white";
    }
    counter++;
}


function readinput(){
    const outputElement = document.getElementById("outputValue");
    const inputElement = document.getElementById("inputValue");
    const inputText = inputElement.value;

    outputElement.textContent = inputText;
}



function calculate(){
    const fistElement = document.getElementById("numberOne");
    const firstNumber = parseInt(fistElement.value);

    const secondElement = document.getElementById("numberTwo");
    const secondNumber = parseInt(secondElement.value);

    const resultElement = document.getElementById("result");
    resultElement.textContent = "Addition of " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber);
}