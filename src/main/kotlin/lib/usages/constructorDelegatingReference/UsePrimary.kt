package lib.usages.constructorDelegatingReference

import lib.declarations.constructorDelegatingReference.ToPrimary

class UsePrimary(a: Int) : ToPrimary(a) {
    val toPrimary = ToPrimary(2)
}

