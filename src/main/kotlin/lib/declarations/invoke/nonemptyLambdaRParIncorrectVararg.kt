package lib.declarations.invoke

class NonemptyLambdaRParIncorrectVararg {
  fun invoke(vararg a: Any) {}
}

// REF: (in Foo).invoke(vararg Any)