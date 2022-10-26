package lib.declarations.companionobject


class DefaultObjectAsExtensionReceiverForProperty {
    companion object B {

    }
}

val DefaultObjectAsExtensionReceiverForProperty.B.bar : Int get() = 1


// REF: companion object of (t).A

