package lib.usages.invoke

import lib.declarations.invoke.LambdaNoParLabel

fun test(f: LambdaNoParLabel) {
  f f@ {}
}

// REF: (in Foo).invoke(Any)