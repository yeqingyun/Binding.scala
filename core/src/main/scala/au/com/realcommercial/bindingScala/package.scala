package au.com.realcommercial

import scalaz.syntax.monad._

package object bindingScala {

  implicit def castBinding[A, B](a: Binding[A])(implicit ev1: A => B): Binding[B] = a.map(ev1)

}