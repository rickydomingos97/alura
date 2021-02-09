var botaoAdicionar = document.querySelector("#adicionar-paciente");
botaoAdicionar.addEventListener("click", (event) => {
    event.preventDefault();

    var form = document.querySelector("#form-adiciona");
     // EXTRAINDO INFORMACOES DO PACIENTE DO FORM //
     var paciente = obtemPAcienteDoFormulario(form);
    // CRIA A TD E A TR DO PACIENTE //
    var pacienteTr = montaTr(paciente);

    // SE O PACIENTE NAO FOR VALIDO, O return VAZIO NAO VAI ADICIONAR O PACIENTE NA TABELA //
    var erros = validaPaciente(paciente);
    if(erros.length > 0){
        exibeMensagensDeErro(erros);
        return;
    }

    
    // ADICIONANDO O PACIENTE NA TABELA //
    var tabela = document.querySelector("#tabela-pacientes");

    tabela.appendChild(pacienteTr);

// LIMPAR OS CAMPOS APOS ADICIONAR UM PACIENTE COM SUCESSO //
    form.reset();
    // LIMPANDO AS MENSAGENS DE ERRO DAS LI DEPOIS DE ADICIONAR UM PACIENTE CORRETAMENTE //
    var mensagemErro = document.querySelector("#mensagens-erro");
    mensagemErro.innerHTML = "";

});

function exibeMensagensDeErro(erros){
    var ul = document.querySelector("#mensagens-erro");
    // APAGAR AS LI DEPOIS DE PRESSIONAR ADICIONAR BUTTON //
    ul.innerHTML = "";

    erros.forEach((erro) => {
        var li = document.createElement("li");
        li.textContent = erro;
        ul.appendChild(li);
    })
}


function obtemPAcienteDoFormulario(form) {

    var paciente = {
        nome: form.nome.value,
        peso: form.peso.value,
        altura: form.altura.value,
        gordura: form.gordura.value,
        imc: calculaImc(form.peso.value, form.altura.value)

    }

    return paciente;
}

function montaTr(paciente) {
// CRIAR O TR //
    var pacienteTr = document.createElement("tr");
// CRIA A CLASSE PACIENTE NO TR ORIGINAL NO HTML //
    pacienteTr.classList.add("paciente");
// CRIANDO AS CLASSES E INSERINDO OS DADOS DO PACIENTE NAS TD //
// ADICIONA OS TDS NA TABELA //
// PARA CADA TR VAI POR UM FILHO NUMA TD //
    pacienteTr.appendChild(montaTd(paciente.nome, "info-nome"));
    pacienteTr.appendChild(montaTd(paciente.peso, "info-peso"));
    pacienteTr.appendChild(montaTd(paciente.altura, "info-altura"));
    pacienteTr.appendChild(montaTd(paciente.gordura, "info-gordura"));
    pacienteTr.appendChild(montaTd(paciente.imc, "info-imc"));

    return pacienteTr;
}

function montaTd(dado, classe) {
    var td = document.createElement("td");
    td.textContent = dado;
    td.classList.add(classe);

    return td;
}

function validaPaciente(paciente){

    var erros = []; // ARRAY DE ERROS CRIADA PARA LISTAR OS ERROS NO HTML //


    if(!validaPeso(paciente.peso)){
        erros.push("Peso Invalido!");
    }

    if(!validaAltura(paciente.altura)){
        erros.push("Altura Invalida!");
    }

    if(paciente.nome.length == 0){
        erros.push("O nome nao pode ser vazio!")
    }

    if(paciente.peso.length == 0){
        erros.push("O peso nao pode ficar em branco")
    }

    if(paciente.altura.length == 0){
        erros.push("A altura nao pode ficar em branco")
    }

    if(paciente.gordura.length == 0) {
        erros.push("a gordura nao pode ficar em branco")
    }


    return erros;
}