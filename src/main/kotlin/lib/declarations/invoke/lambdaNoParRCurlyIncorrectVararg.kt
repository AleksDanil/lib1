package lib.declarations.invoke

class LambdaNoParRCurlyIncorrectVararg {
  operator fun invoke(vararg a: Any) {}
}

// REF: (in Foo).invoke(vararg Any)