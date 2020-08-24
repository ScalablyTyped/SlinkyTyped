package typingsSlinky.superstruct.mod

import typingsSlinky.std.Record
import typingsSlinky.superstruct.structMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct", "record")
@js.native
object record extends js.Object {
  def apply[K /* <: String | Double */, V](Key: Struct[K, _], Value: Struct[V, _]): Struct[Record[K, V], _] = js.native
}

