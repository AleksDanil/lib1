package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelClassVsLocalClassConstructor2

fun testTopLevelClassVsLocalClassConstructor2() {
    class TopLevelClassVsLocalClassConstructor2(i: Int)

    TopLevelClassVsLocalClassConstructor2()
}

// REF: (test).Conflict