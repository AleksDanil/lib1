package lib.declarations.invoke

class NoParams {
  operator fun invoke(vararg a: Any) {}
}

// REF: (in Foo).invoke(vararg Any)