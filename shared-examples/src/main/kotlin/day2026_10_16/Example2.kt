package day2026_10_16
// Do some kotlin stuff relevent to TxManager

// I want to be able to store a map conection TxObjects to changes
// that we make
data class OldAndNew<T>(val oldValue: T, val newValue: T)
class TxObject<T>(var value: T) {

}

// Below version doesn't work because map might have lots of differently
// typed TxObjects, e.g. one key might be TxObject<Int>, another
// might be a TxObject<String>, etc.
//var txHistory = mutableMapOf<TxObject<T>, OldAndNew<T>>()
var txHistory = mutableMapOf<TxObject<Any>, OldAndNew<Any>>()

@Suppress("UNCHECKED_CAST")
fun main() {
    val t = TxObject(3)
    //txHistory[t] = OldAndNew(3, 7)  DOESN'T WORK
    txHistory[t as TxObject<Any>] = OldAndNew(3, 7)
}