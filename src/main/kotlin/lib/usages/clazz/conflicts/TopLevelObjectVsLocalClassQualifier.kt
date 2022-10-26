package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelObjectVsLocalClassQualifier

lateinit var t8: TopLevelObjectVsLocalClassQualifier

fun testTopLevelObjectVsLocalClassQualifier() {
    class TopLevelObjectVsLocalClassQualifier

    val d: TopLevelObjectVsLocalClassQualifier
}

// REF: (test).Conflict
