package lib.declarations.invoke

class LambdaNoParLabelIncorrectVararg {
  operator fun invoke(vararg a: Any) {}
}

// REF: (in Foo).invoke(vararg Any)