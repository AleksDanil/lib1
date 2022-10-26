package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelClassVsLocalClassConstructor

lateinit var t1: TopLevelClassVsLocalClassConstructor

fun testTopLevelClassVsLocalClassConstructor() {
    class TopLevelClassVsLocalClassConstructor

    TopLevelClassVsLocalClassConstructor()
}

// REF: (in test.test).Conflict