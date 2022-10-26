package lib.declarations.invoke

class LambdaNoParIncorrectVararg {
  operator fun invoke(vararg a: Any) {}
}


// REF: (in Foo).invoke(vararg Any)