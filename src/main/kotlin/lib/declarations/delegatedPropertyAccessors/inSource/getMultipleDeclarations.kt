package lib.declarations.delegatedPropertyAccessors.inSource

interface Foo3 {
  operator fun getValue(p1: Any?, p2: Any?): Int = 1
}

interface Bar {
  operator fun getValue(p1: Any?, p2: Any?): Int = 1
}

interface Zoo {
  operator fun setValue(p1: Any?, p2: Any?, p3: Any?) = Unit
}

class MultipleDeclarations : Foo3, Bar, Zoo {
  override fun getValue(p1: Any?, p2: Any?): Int {
    return super<Foo3>.getValue(p1, p2)
  }
}

// MULTIRESOLVE
// REF: (in Bar).getValue(Any?, Any?)
// REF: (in Foo).getValue(Any?, Any?)
// REF: (in Zoo).setValue(Any?, Any?, Any?)
