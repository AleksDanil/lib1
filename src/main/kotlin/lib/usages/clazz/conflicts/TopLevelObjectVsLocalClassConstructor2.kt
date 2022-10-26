package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelObjectVsLocalClassConstructor2

lateinit var t7: TopLevelObjectVsLocalClassConstructor2

fun testTopLevelObjectVsLocalClassConstructor2() {
    class TopLevelObjectVsLocalClassConstructor2

    TopLevelObjectVsLocalClassConstructor2()
}

// REF: (in test.test).Conflict