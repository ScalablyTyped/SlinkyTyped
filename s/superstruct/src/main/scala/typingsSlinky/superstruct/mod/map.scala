package typingsSlinky.superstruct.mod

import typingsSlinky.std.Map
import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "map")
@js.native
object map extends js.Object {
  def apply[K, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Map[K, V], _] = js.native
}

