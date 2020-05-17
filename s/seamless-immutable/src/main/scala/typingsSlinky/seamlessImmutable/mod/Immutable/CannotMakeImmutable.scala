package typingsSlinky.seamlessImmutable.mod.Immutable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seamlessImmutable.mod.Immutable.AlreadyImmutable[O]
  - typingsSlinky.seamlessImmutable.mod.Immutable.Primitive
*/
trait CannotMakeImmutable[O /* <: js.Object */] extends js.Object

object CannotMakeImmutable {
  @scala.inline
  implicit def apply[O](value: AlreadyImmutable[O]): CannotMakeImmutable[O] = value.asInstanceOf[CannotMakeImmutable[O]]
  @scala.inline
  implicit def apply[O](value: Primitive): CannotMakeImmutable[O] = value.asInstanceOf[CannotMakeImmutable[O]]
}

