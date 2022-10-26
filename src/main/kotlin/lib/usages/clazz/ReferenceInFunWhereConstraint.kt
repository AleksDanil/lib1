package lib.usages.clazz

import lib.declarations.clazz.ReferenceInFunWhereConstraint

fun <T> some() where T: ReferenceInFunWhereConstraint {}

// REF: (test).A