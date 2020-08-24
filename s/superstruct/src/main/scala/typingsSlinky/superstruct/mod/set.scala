package typingsSlinky.superstruct.mod

import typingsSlinky.std.Set
import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "set")
@js.native
object set extends js.Object {
  def apply[T](Element: Struct[T, _]): Struct[Set[T], _] = js.native
}

