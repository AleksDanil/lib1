package lib.usages.annotation

import lib.declarations.annotation.AnnotationInsideFunction

fun test() {
    @AnnotationInsideFunction fun some() {
    }
}

// REF: (test).Annotation