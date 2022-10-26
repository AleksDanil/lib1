package lib.usages.invoke

import lib.declarations.invoke.NonemptyLambdaRPar


fun test(f: NonemptyLambdaRPar) {
  f() { 1}
}

// REF: (in Foo).invoke(Any)