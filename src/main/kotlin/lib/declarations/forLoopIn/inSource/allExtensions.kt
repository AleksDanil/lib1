package lib.declarations.forLoopIn.inSource

interface AllExtensions1

operator fun AllExtensions1.iterator(): AllExtensions2 {
    return object : AllExtensions2 {

    }
}

interface AllExtensions2

operator fun AllExtensions2.next(): Any {
    return Any()
}

operator fun AllExtensions2.hasNext(): Boolean = true

// MULTIRESOLVE
// REF: (for Foo in <root>).iterator()
// REF: (for Iterator in <root>).next()
// REF: (for Iterator in <root>).hasNext()
