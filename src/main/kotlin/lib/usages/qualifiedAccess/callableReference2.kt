// IGNORE_FE10
package usages.qualifiedaccess

import lib.declarations.qualifiedaccess.CallableReference2

fun test2() {
    CallableReference2::foo // FE1.0 won't resolve this
}

// REF: companion object of (rederences.qualifiedaccess).AA
