package typingsSlinky.std.global

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.MapConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Map")
@js.native
class Map[K, V] ()
  extends typingsSlinky.std.Map[K, V] {
  def this(entries: js.Array[js.Tuple2[K, V]]) = this()
  def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
}

@JSGlobal("Map")
@js.native
object Map extends TopLevel[MapConstructor]

