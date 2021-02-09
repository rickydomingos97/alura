var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function(event){
    event.target.parentNode.remove()
})

/*
// PODEMOS ATE FAZER USANDO VARIAVEIS PARA DEIXAR O CODIGO MAIS EXPLICITO //

var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function(event) {
    var alvoEvento = event.target;
    var paiDoAlvo = alvoEvento.parentNode; // TR = paciente = remover 
    paiDoAlvo.remove();
});
*/


/* codigo anterior para remover usuario. o problema eh que ele nao deleta quem foi adicionado na pagin apor ultimo e so deleta quem ja estava na tabela quando a pagina foi carregada.

// SELECIONANDO TODOS OS PACIENTES DA TABELA //
var pacientes = document.querySelectorAll(".paciente");
// PARA CADA PACIENTE DO MEU ARRAY EU VOU FAZER ALGO //
// CLICK EVENTO ADD COM UMA FUNCAO ANONIMA //
pacientes.forEach((paciente) => {
    paciente.addEventListener("dblclick", function(){
        console.log("fui clicado com duplo");
        this.remove()
    });
})
*/