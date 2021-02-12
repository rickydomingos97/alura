// SELECIONA O BOTAO //

var botaoAdicionar = document.querySelector("#buscar-pacientes");

// COLOCANDO UM EVENTO DE CLICK NO BOTAO //
botaoAdicionar.addEventListener("click", function () {
    console.log("Buscando pacientes");
    // TRAZENDO OS DADOS DE UM SERVIDOR EXTERNO POR HTTP REQUEST //
    // HTTP-REQUEST EH UM OBJETO DO JS //
    var xhr = new XMLHttpRequest();
    xhr.open("GET", "https://api-pacientes.herokuapp.com/pacientes");
    // CARREGANDO OS DADOS DA API NO NOSOO SITE //
    xhr.addEventListener("load", function () {
        // VERIFICANDO O STATUS DO SERVER //
        var erroAjax = document.querySelector("#erro-ajax");

        if (xhr.status == 200) {
            erroAjax.classList.add("invisivel");
            // EXIBINDO A RESPOSTA DO SERVER COM OS DADOS // 
            var resposta = xhr.responseText;
            var pacientes = JSON.parse(resposta);
            /* PEGA O PACIENTE QUE ESTA SENDO PASSADO NO ARRAY
            E JOGA ELE PRA DENTRO DA TABELA */
            pacientes.forEach(function (paciente) {
                adicionaPacienteNaTabela(paciente);
            });
        } else {
            erroAjax.classList.remove("invisivel")
        }
    });

    xhr.send();
});