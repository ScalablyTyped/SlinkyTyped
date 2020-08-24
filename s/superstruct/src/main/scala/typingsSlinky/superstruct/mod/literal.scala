package typingsSlinky.superstruct.mod

import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "literal")
@js.native
object literal extends js.Object {
  def apply[T](constant: T): Struct[T, _] = js.native
}

