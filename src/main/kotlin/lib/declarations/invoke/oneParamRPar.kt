package lib.declarations.invoke

class OneParamRPar {
  operator fun invoke(vararg a: Any) {}
}

// REF: (in Foo).invoke(vararg Any)