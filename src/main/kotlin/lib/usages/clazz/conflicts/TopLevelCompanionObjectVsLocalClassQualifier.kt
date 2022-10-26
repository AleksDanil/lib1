package lib.usages.clazz.conflicts

import lib.declarations.clazz.conflicts.TopLevelCompanionObjectVsLocalClassQualifier

lateinit var t5: TopLevelCompanionObjectVsLocalClassQualifier

fun testTopLevelCompanionObjectVsLocalClassQualifier() {
    class TopLevelCompanionObjectVsLocalClassQualifier()

    TopLevelCompanionObjectVsLocalClassQualifier()
}

// REF: (in test.test).Conflict