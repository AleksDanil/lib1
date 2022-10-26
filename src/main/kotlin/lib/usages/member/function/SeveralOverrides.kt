package lib.usages.member.function

import lib.declarations.member.function.SeveralOverridesC

fun test(c: SeveralOverridesC) {
    c.foo()
}

// MULTIRESOLVE
// REF: (in A).foo()
// REF: (in B).foo()