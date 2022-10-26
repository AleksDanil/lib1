package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelCompanionObjectVsLocalClassConstructor2

lateinit var t4: TopLevelCompanionObjectVsLocalClassConstructor2

fun testTopLevelCompanionObjectVsLocalClassConstructor2() {
    class TopLevelCompanionObjectVsLocalClassConstructor2

    TopLevelCompanionObjectVsLocalClassConstructor2()
}

// REF: (in test.test).Conflict