package lib.declarations.parame.function

open class B

class A

val prop = object : B() {
    private fun foo(x: A): A {
        return x
    }
}

// REF: (in object in prop).x
