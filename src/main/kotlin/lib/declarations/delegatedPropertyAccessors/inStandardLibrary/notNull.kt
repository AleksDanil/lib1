package lib.declarations.delegatedPropertyAccessors.inStandardLibrary

import kotlin.properties.Delegates

var x2: Int by Delegates.notNull()

// MULTIRESOLVE
// REF: (in kotlin.properties.ReadWriteProperty).getValue(T, KProperty<*>)
// REF: (in kotlin.properties.ReadWriteProperty).setValue(T, KProperty<*>, V)