package lib.usages.invoke

import lib.declarations.invoke.OneParam

fun test(f: OneParam, p: Int) {
  f(p)
}

// REF: (in Foo).invoke(vararg Any)