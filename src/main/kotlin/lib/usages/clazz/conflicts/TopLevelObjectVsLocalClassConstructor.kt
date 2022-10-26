package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelObjectVsLocalClassConstructor

lateinit var t6: TopLevelObjectVsLocalClassConstructor

fun testTopLevelObjectVsLocalClassConstructor() {
    class TopLevelObjectVsLocalClassConstructor

    TopLevelObjectVsLocalClassConstructor()
}

// REF: (in test.test).Conflict