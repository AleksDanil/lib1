package lib.declarations.member.function

interface SeveralOverridesA {
    fun foo()
}

interface SeveralOverridesB {
    fun foo()
}

interface SeveralOverridesC : SeveralOverridesA, SeveralOverridesB {

}

// MULTIRESOLVE
// REF: (in A).foo()
// REF: (in B).foo()