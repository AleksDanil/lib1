package lib.usages.member.property

import lib.declarations.member.property.KotlinPropertyAssignment


fun KotlinPropertyAssignment.foo(a: KotlinPropertyAssignment) {
    print(a.something)
    a.something = 1
    a.something += 1
    a.something++
    --a.something

    something++
    (something)++
    (something) = 1
    (a.something) = 1
}

// MULTIRESOLVE
// REF1: (in A).something
// REF2: (in A).something
// REF3: (in A).something
// REF4: (in A).something
// REF5: (in A).something
// REF6: (in A).something
// REF7: (in A).something
// REF8: (in A).something
// REF9: (in A).something
