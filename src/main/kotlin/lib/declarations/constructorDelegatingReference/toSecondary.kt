package lib.declarations.constructorDelegatingReference


open class ToSecondary(a: Int) {
    constructor(b: String) : this(2)

    constructor() : this("2")
}

// REF: (in A).A(String)

