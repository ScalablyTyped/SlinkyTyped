package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "pattern")
@js.native
object pattern extends js.Object {
  def apply[T /* <: String */](S: Struct[T, _], regexp: js.RegExp): Struct[T, _] = js.native
}

