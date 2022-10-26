// IGNORE_FIR
package usages.qualifiedaccess


fun test5() {
    val b = lib.declarations.qualifiedaccess.ResolveFullyQualifiedCompanionObject.BB
}

// REF: companion object of (in rederences.qualifiedaccess.AA).BB
