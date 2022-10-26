package lib.declarations.member.property

class KotlinPropertyAssignment {
    var something: Int = 10
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
