package typingsSlinky.seamlessImmutable.mod.Immutable

import typingsSlinky.seamlessImmutable.mod.ImmutableArray
import typingsSlinky.seamlessImmutable.mod.ImmutableDate
import typingsSlinky.seamlessImmutable.mod.ImmutableObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seamlessImmutable.mod.ImmutableObject[T]
  - typingsSlinky.seamlessImmutable.mod.ImmutableDate
  - typingsSlinky.seamlessImmutable.mod.ImmutableArray[js.Any]
  - T
*/
trait MakeImmutable[T, O /* <: js.Object */] extends js.Object

object MakeImmutable {
  @scala.inline
  implicit def apply[T, O](value: ImmutableArray[js.Any]): MakeImmutable[T, O] = value.asInstanceOf[MakeImmutable[T, O]]
  @scala.inline
  implicit def apply[T, O](value: ImmutableDate): MakeImmutable[T, O] = value.asInstanceOf[MakeImmutable[T, O]]
  @scala.inline
  implicit def apply[T, O](value: ImmutableObject[T]): MakeImmutable[T, O] = value.asInstanceOf[MakeImmutable[T, O]]
  @scala.inline
  implicit def apply[T, O](value: T): MakeImmutable[T, O] = value.asInstanceOf[MakeImmutable[T, O]]
}

