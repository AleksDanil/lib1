package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelCompanionObjectVsLocalClassConstructor

lateinit var t3: TopLevelCompanionObjectVsLocalClassConstructor

fun testTopLevelCompanionObjectVsLocalClassConstructor() {
    class TopLevelCompanionObjectVsLocalClassConstructor

    val d: TopLevelCompanionObjectVsLocalClassConstructor
}

// REF: companion object of (test).Conflict
