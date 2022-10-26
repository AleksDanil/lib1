package lib.declarations.companionobject


interface DefaultObjectAsReceiverForMemberPropertyInSuperTypeTrait {
    val some : Int get() = 1
}

open class DefaultObjectAsReceiverForMemberPropertyInSuperType {
    companion object Companion : DefaultObjectAsReceiverForMemberPropertyInSuperTypeTrait {

    }
}


// REF: companion object of (t).A

