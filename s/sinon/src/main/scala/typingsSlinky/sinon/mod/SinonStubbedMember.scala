package typingsSlinky.sinon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Replaces a type with a Sinon stub if it's a function.
  */
/* Rewritten from type alias, can be one of: 
  - T
  - typingsSlinky.sinon.mod.SinonStub
*/
trait SinonStubbedMember[T] extends js.Object

object SinonStubbedMember {
  @scala.inline
  implicit def apply[T](value: SinonStub): SinonStubbedMember[T] = value.asInstanceOf[SinonStubbedMember[T]]
  @scala.inline
  implicit def apply[T](value: T): SinonStubbedMember[T] = value.asInstanceOf[SinonStubbedMember[T]]
}

