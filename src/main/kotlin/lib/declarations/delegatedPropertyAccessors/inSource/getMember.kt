package lib.declarations.delegatedPropertyAccessors.inSource

class GetMember {
    operator fun getValue(_this: Any?, p: Any?): Int = 1
}

// REF: (in Foo).getValue(Any?, Any?)

