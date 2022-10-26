package lib.declarations.forLoopIn.inSource

interface NextMissing {
  operator fun iterator(): NextMissing2
}

interface NextMissing2 {
  operator fun hasNext(): Boolean
}

// MULTIRESOLVE
// REF: (in Foo).iterator()
// REF: (in Iterator).hasNext()
