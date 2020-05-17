package typingsSlinky.seamlessImmutable.mod.Immutable

import typingsSlinky.seamlessImmutable.mod.ImmutableArray
import typingsSlinky.seamlessImmutable.mod.ImmutableDate
import typingsSlinky.seamlessImmutable.mod.ImmutableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seamlessImmutable.mod.ImmutableObject[O]
  - typingsSlinky.seamlessImmutable.mod.ImmutableArray[js.Any]
  - typingsSlinky.seamlessImmutable.mod.ImmutableDate
*/
trait AlreadyImmutable[O /* <: js.Object */] extends CannotMakeImmutable[O]

object AlreadyImmutable {
  @scala.inline
  implicit def apply[O](value: ImmutableArray[js.Any]): AlreadyImmutable[O] = value.asInstanceOf[AlreadyImmutable[O]]
  @scala.inline
  implicit def apply[O](value: ImmutableDate): AlreadyImmutable[O] = value.asInstanceOf[AlreadyImmutable[O]]
  @scala.inline
  implicit def apply[O](value: ImmutableObject[O]): AlreadyImmutable[O] = value.asInstanceOf[AlreadyImmutable[O]]
}

