var botaoAdicionar = document.querySelector("#adicionar-paciente");

botaoAdicionar.addEventListener("click", (event) => {

    event.preventDefault();

    var form = document.querySelector("#form-adiciona");
    var paciente = obtemPacienteDoFormulario(form);

    var erros = validaPaciente(paciente);
    if (erros.length > 0) {
        exibeMensagensDeErro(erros);
        return;
    }

    /* TIRAMOS DAQUI O MONTAR A TABELA,
    TIRAMOS O BUSCAR A TABELA
    E TIRAMOS O INSERIR PACIENTE NA TABELA
    E TRANSFORMAMOS NUMA FUNCAO
    E RECOLOCAMOS OS ITENS DE VOLTA NA FUNCAO DO BOTAO */

    adicionaPacienteNaTabela(paciente);

    form.reset();
    var mensagemErro = document.querySelector("#mensagens-erro");
    mensagemErro.innerHTML = "";

});

/* ESSA FUNCAO VAI ADOCIONAR O PACIENTE NA TABELA
PRIMEIRO MONTA A TABELA
VAI NA TABELA E BUCA A TABELA
DEPOIS BUSCA O PACIENTE TR E POE NA TABELA
*/
function adicionaPacienteNaTabela(paciente) {
    var pacienteTr = montaTr(paciente);
    var tabela = document.querySelector("#tabela-pacientes");
    tabela.appendChild(pacienteTr);
}

function exibeMensagensDeErro(erros) {
    var ul = document.querySelector("#mensagens-erro");
    ul.innerHTML = "";

    erros.forEach((erro) => {
        var li = document.createElement("li");
        li.textContent = erro;
        ul.appendChild(li);
    })
}


function obtemPacienteDoFormulario(form) {

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

function validaPaciente(paciente) {

    var erros = []; // ARRAY DE ERROS CRIADA PARA LISTAR OS ERROS NO HTML //


    if (!validaPeso(paciente.peso)) {
        erros.push("Peso Invalido!");
    }

    if (!validaAltura(paciente.altura)) {
        erros.push("Altura Invalida!");
    }

    if (paciente.nome.length == 0) {
        erros.push("O nome nao pode ser vazio!")
    }

    if (paciente.peso.length == 0) {
        erros.push("O peso nao pode ficar em branco")
    }

    if (paciente.altura.length == 0) {
        erros.push("A altura nao pode ficar em branco")
    }

    if (paciente.gordura.length == 0) {
        erros.push("a gordura nao pode ficar em branco")
    }


    return erros;
}