package lib.declarations.forLoopIn.inBuiltIns

fun main(it: Iterator<Any>) {
  for (i in it.iterator()) {}
}

// MULTIRESOLVE
// REF: (for Iterator<T> in kotlin.collections).iterator()
// REF: (in kotlin.collections.Iterator).hasNext()
// REF: (in kotlin.collections.Iterator).next()
