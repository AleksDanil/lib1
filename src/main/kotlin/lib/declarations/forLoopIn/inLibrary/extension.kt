package lib.declarations.forLoopIn.inLibrary

fun main() {
  for (i in "") {}
}

// MULTIRESOLVE
// REF: (for CharSequence in kotlin.text).iterator()
// REF: (in kotlin.collections.CharIterator).next()
// REF: (in kotlin.collections.Iterator).hasNext()
