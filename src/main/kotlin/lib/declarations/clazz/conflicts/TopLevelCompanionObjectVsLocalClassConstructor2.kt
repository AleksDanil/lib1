package lib.declarations.clazz.conflicts

class TopLevelCompanionObjectVsLocalClassConstructor2(i: Int) {
    companion object {
        operator fun invoke() {}
    }
}

// REF: (in test.test).Conflict