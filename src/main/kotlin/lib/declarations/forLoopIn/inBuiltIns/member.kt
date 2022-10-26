package lib.declarations.forLoopIn.inBuiltIns

fun main() {
  for (i in 1..2) {}
}

// MULTIRESOLVE
// REF: (in kotlin.collections.IntIterator).next()
// REF: (in kotlin.ranges.IntProgression).iterator()
// REF: (in kotlin.collections.Iterator).hasNext()
