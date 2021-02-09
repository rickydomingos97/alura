// SELECIONA O CONTEUDO A SER ALTERADO //
var titulo = document.querySelector(".titulo");
// ALTERA O CONTEUDO SELECIONADO E IMPRIME NA PAGINA //
titulo.textContent = "Aparecida Nutricionista Alura"

var paciente = document.querySelector("#primeiro-paciente");

var tdPeso = paciente.querySelector(".info-peso");
var peso = tdPeso.textContent;

var tdAltura = paciente.querySelector(".info-altura");
var altura = tdAltura.textContent;

var tdImc = paciente.querySelector(".info-imc")

var pacientes = document.querySelectorAll(".paciente");


for (var i = 0; i < pacientes.length; i++) {

    var paciente = pacientes[i];

    var tdPeso = paciente.querySelector(".info-peso");
    var peso = tdPeso.textContent;

    var tdAltura = paciente.querySelector(".info-altura");
    var altura = tdAltura.textContent;

    var tdImc = paciente.querySelector(".info-imc");

    var pesoEhValido = validaPeso(peso);
    var alturaEhValida = validaAltura(altura);

    if (!pesoEhValido) {
        console.log("Peso inválido!");
        pesoEhValido = false;
        tdImc.textContent = "Peso inválido";
        paciente.classList.add("paciente-invalido");
    }

    if (!alturaEhValida) {
        console.log("Altura inválida!");
        alturaEhValida = false;
        tdImc.textContent = "Altura inválida";
        paciente.classList.add("paciente-invalido");
    }

    if (alturaEhValida && pesoEhValido) {
        var imc = calculaImc(peso, altura) // a var imc puxa da funcao abaixo o calculo do imc separadamente
        tdImc.textContent = imc;
    }
}


// VALIDANDO O PESO //
function validaPeso(peso) {
    if(peso >= 0 && peso < 1000){
        return true;
    }else{
        return false;
    }
}

// VALIDA ALTURA //
function validaAltura(altura){
    if(altura >= 0 && altura <= 3.0){
        return true;
    }else{
        return false;
    }
}

// Aogra temos a funcao calcula imc separa do resto do codigo js
function calculaImc(peso, altura) {
    var imc = 0;
    
    imc = peso / (altura * altura);

    return imc.toFixed(2);
}