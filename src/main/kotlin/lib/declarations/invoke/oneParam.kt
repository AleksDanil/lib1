package lib.declarations.invoke

class OneParam {
  operator fun invoke(vararg a: Any) {}
}

// REF: (in Foo).invoke(vararg Any)