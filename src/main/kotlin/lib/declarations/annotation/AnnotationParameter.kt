package lib.declarations.annotation

enum class Param {
    A, B, C
}

annotation class AnnotationParameter(val clazz: Param)

// REF: (testing).ATest