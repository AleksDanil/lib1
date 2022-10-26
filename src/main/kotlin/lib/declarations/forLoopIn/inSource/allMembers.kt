package lib.declarations.forLoopIn.inSource

interface AllMembers {
  operator fun iterator(): Iterator
}

interface Iterator {
  operator fun next(): Any
  operator fun hasNext(): Boolean
}

// MULTIRESOLVE
// REF: (in Foo).iterator()
// REF: (in Iterator).next()
// REF: (in Iterator).hasNext()
