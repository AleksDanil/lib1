package lib.declarations.companionobject


interface DefaultObjectAsReceiverForExtensionFunctionOnSuperTypeTrait

open class DefaultObjectAsReceiverForExtensionFunctionOnSuperType {
    companion object Companion : DefaultObjectAsReceiverForExtensionFunctionOnSuperTypeTrait {

    }
}

fun DefaultObjectAsReceiverForExtensionFunctionOnSuperTypeTrait.foo() {}


// REF: companion object of (t).A

