if (0 == false && 0 == [] && "0" == []){
    console.log("São iguals");
}


//function fazAlgo( tarefa ){
//    console.log("Fazendo algo: " + tarefa );
//}


const fazAlgo = ( tarefa ) => {
    console.log("Fazendo algo: " + tarefa );
};

//const quadrado = ( n ) => { return n *n };

const quadrado = n => n * n;

console.log(quadrado(2));

function somar (n1, n2) {
    return n1 + n2;
}

function multiplicar(n1, n2){
    return n1 * n2;
}

function calcular (n1, n2, operacao){   
    return operacao(n1, n2);
}

console.log("Soma: ", calcular(5, 7, somar));
console.log("Multiplicar: ", calcular(5, 7, multiplicar));

let r1 = calcular(5,7, (n1, n2) => { return n1 = n2 } );
console.log("R1: ", r1)

fazAlgo("Nada");
fazAlgo("Atividade");
fazAlgo("Descansar");