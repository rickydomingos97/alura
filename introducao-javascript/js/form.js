var botaoAdicionar = document.querySelector("#adicionar-paciente");
botaoAdicionar.addEventListener("click", (event) => {
    event.preventDefault();
    //selecionamos o id do formulario de cadastro de pacientes
    var form = document.querySelector("#form-adiciona");
    //coletamos os dados inseridos pelo usuario
    var nome = form.nome.value;
    var peso = form.peso.value;
    var altura = form.altura.value;
    var gordura = form.gordura.value;

    //criar uma var para inserir os dados do paciente na tr
    // para isso vamos usar o createElement()
    var pacienteTr = document.createElement("tr");
    // criar as variaveis para inserir os dados nos td
    var nomeTd = document.createElement("td");
    var pesoTd = document.createElement("td");
    var alturaTd = document.createElement("td");
    var gorduraTd = document.createElement("td");
    var imcTd = document.createElement("td");

    // Inserir os dados dos pacientes na tabela

    nomeTd.textContent = nome;
    pesoTd.textContent = peso;
    alturaTd.textContent = altura;
    gorduraTd.textContent = gordura;
    imcTd.textContent = calculaImc(peso, altura); // a caculaImc veio do calculaImc.js

    pacienteTr.appendChild(nomeTd);
    pacienteTr.appendChild(pesoTd);
    pacienteTr.appendChild(alturaTd);
    pacienteTr.appendChild(gorduraTd);
    pacienteTr.appendChild(imcTd);
    // criar tabela recebento o id de tabela-pacientes
    var tabela = document.querySelector("#tabela-pacientes");

    tabela.appendChild(pacienteTr);

});