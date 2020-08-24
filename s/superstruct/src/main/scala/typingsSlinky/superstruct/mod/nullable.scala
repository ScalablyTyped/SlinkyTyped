package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "nullable")
@js.native
object nullable extends js.Object {
  def apply[T](S: Struct[T, _]): Struct[T | Null, _] = js.native
}

