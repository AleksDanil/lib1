package lib.declarations.delegatedPropertyAccessors.inSource

interface Foo {
  operator fun getValue(p1: Any?, p2: Any?): Int = 1
}

class GetOneFakeOverride: Foo

// REF: (in Foo).getValue(Any?, Any?)
