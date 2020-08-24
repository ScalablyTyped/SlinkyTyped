package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "is")
@js.native
object is extends js.Object {
  def apply[T](value: js.Any, struct: Struct[T, _]): /* is T */ Boolean = js.native
}

