// IGNORE_FE10
package usages.qualifiedaccess

import lib.declarations.qualifiedaccess.CallableReference3
import lib.declarations.qualifiedaccess.foo


fun test3() {
    CallableReference3::foo // FE1.0 won't resolve this
}

// REF: companion object of (rederences.qualifiedaccess).AA
