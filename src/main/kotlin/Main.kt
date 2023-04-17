import java.util.Scanner

fun main() {
    //1 - Escreva um programa que leia uma frase do usuário e imprima quantos caracteres
    //ela possui usando length.
    val teclado = Scanner(System.`in`)

    var frase:String

    println("Informe uma frase: ")
    frase=teclado.nextLine()
    println("Esta frase tem ${frase.length} caracteres")

    //2- Escreva um programa que leia uma frase do usuário e imprima a mesma frase em
    //ordem inversa usando loop for.

    println("Informe uma frase: ")
    frase=teclado.nextLine()
    for (i in frase.lastIndex downTo 0){
        print(frase[i])
    }

   //3 - Escreva um programa que leia uma frase do usuário e imprima apenas as vogais da
    //frase usando loop for e if.

    println("\ninforme uma frase: ")
    frase=teclado.nextLine().uppercase()
    print("Vogais: ")
    for(i in 0..frase.lastIndex){
        if(frase[i]== 'A'|| frase[i]== 'E'|| frase[i]== 'I'|| frase[i]== 'O'|| frase[i]== 'U'){
            print(frase[i])
        }

    }
}