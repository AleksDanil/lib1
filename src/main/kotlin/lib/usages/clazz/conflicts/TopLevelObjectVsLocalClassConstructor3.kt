// IGNORE_FIR

package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelObjectVsLocalClassConstructor3

fun testTopLevelObjectVsLocalClassConstructor3() {
    class TopLevelObjectVsLocalClassConstructor3(i: Int)

    TopLevelObjectVsLocalClassConstructor3()
}

// REF: (test).Conflict