package lib.declarations.invoke

class NoParamsRPar {
  operator fun invoke(vararg a: Any) {}
}

// REF: (in Foo).invoke(vararg Any)