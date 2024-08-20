//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {

     /*   suma()
        resta()
        println("la raíz es :${raiz()}")
        println(cuadrado())
        println (saludo())
        division(12.0,2.0)
       //multi(5.0,6.0

      */
     var estado=true
    while (estado){
        println("1.suma")
        println("2.resta")
        println("3.raiz")
        println("4.division")
        println("5.cuadrado")
        println("6.multiplicacion")
        println("7.saludo")
        println("8.salir")
        println("Digite una opcion")
        var op = readln().toInt()
        if (op==1){
            suma()
            break
        }else if(op==2){
            resta()
            break
        }
        else if(op==3){
            println("la raíz es :${raiz()}")
            break
        }else if(op==4){
            division(12.0,2.0)
            break
        }
        else if(op==5){
            println(cuadrado())
            break
        }
        else if(op==6){
            println( multi(7.0,6.0))
            break
        }
        else if(op==7){
            println( saludo())
            break
        }

        else if(op==8){
            estado=false
        }
    }
}
var n1=5.0
var n2=6
fun suma(){
    var n1=5
    var n2=6
    var suma=n1+n2
    println("la suma es $suma")

}
fun resta(){
    var n1=4
    var n2=7
    var resta=n1-n2
    println ("resta es:$resta")
}
//hay las variables n1 y n2 son privadas ya estan dentro de una funcion, si etubiera fuera de las funciones si seria tipo global


//2.
fun raiz():Double{
    return sqrt(n1) //la raiz se calcula con la biblietoca matematica con la palabra sqrt

}

fun cuadrado():Double{
    return Math.pow(n1,2.0)
}

fun saludo():String{
    return "hola mundo"
}

//3.
fun division (numero1:Double, numero2:Double){      //       hay queda la variables que estan dentro de los parentesis por defento como una variable val
    var div=numero1/numero2
    println("la division es ${div}")

}

//4.

fun multi(numero1: Double,numero2:Double):String {

    return "la multiplicacion es: ${numero1*numero2}"
}
