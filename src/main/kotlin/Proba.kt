import java.time.LocalDate
import java.time.Period
import java.time.temporal.ChronoUnit
import kotlin.math.abs

class Proba {
 //ovde samo testiramo ponasanje pojedinacnih funkcija u kotlinu, nije relevantno za projekat
}

fun main() {
    var duzina : Int = 0
    var duzina2 : Long = 0
    var dat1 : LocalDate = LocalDate.of(2022,4,5)
    var dat2 : LocalDate = LocalDate.of(2022,4,21)
    duzina = dat1.compareTo(dat2)
    duzina2 = ChronoUnit.DAYS.between(dat1, dat2)

    //println(duzina)
    //println(duzina2)
    //println(abs(duzina))

    var lista = mutableListOf<LocalDate>()
    //lista.add(11)
    //lista.add(12)
    //lista.add(13)

    //var mapa : MutableMap<Int, MutableList<Int>> = emptyMap<Int, MutableList<Int>>() as MutableMap<Int, MutableList<Int>>
    //mapa.put(key = 1, value = lista)
    //mapa.put(key = 2, value = lista)
    //mapa.put(key = 4, value = lista)

    //var list : MutableList<Int>? = mapa.get(1)

    for (i in 0..2) {
        val period = Period.of(0, 0, i)
        val date = dat1.plus(period)
        lista.add(date)
    }

    println(lista)



}