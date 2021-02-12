var campoFiltro = document.querySelector("#filtrar-tabela"); //SELECIONA O FILTER NO HTML//

campoFiltro.addEventListener("input", function(){
    console.log(this.value);
    var pacientes = document.querySelectorAll(".paciente");//ESCUTA TODOS OS PACIENTES NA TABELA//

    if (this.value.length > 0){
        for (var i = 0; i < pacientes.length; i++){
            var paciente = pacientes[i];
            var tdNome = paciente.querySelector(".info-nome");
            var nome = tdNome.textContent;
///////////////////// EXPRESSAO REGULAR //////////////////////
            var expressao = new RegExp(this.value, "i");
/* COMO USAR? AO INVES DE TESTAR A PALAVRA INTEIRA, VAMOS TESTAR
SE EXISTE PELO MENOS UM APARTE DA PALAVRA NO NOSSO NOME VALUE 
TROCAMOS O if (nome != this.value) PELO if (expressao.teste(nome))*/

            if (!expressao.test(nome)){
                paciente.classList.add("invisivel");
            } else {
                paciente.classList.remove("invisivel");
            } //THIS FOR CHECK IF THERE IS SOME LETTERS ON INPUT//
        }
    } else {// CASO CONTRARIO A LISTA APARECE NOVAMENTE E A CLASSE REMOVE EH RETIRADA//
        for (var i = 0; i < pacientes.length; i++) {
            var paciente = pacientes[i];
            paciente.classList.remove("invisivel");
        }
    }
});