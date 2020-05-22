package typingsSlinky.wordpressBlocks.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/blocks", "createBlock")
@js.native
object createBlock extends js.Object {
  def apply[T /* <: Record[String, _] */](name: String): BlockInstance[T] = js.native
  def apply[T /* <: Record[String, _] */](name: String, attributes: Partial[T]): BlockInstance[T] = js.native
  def apply[T /* <: Record[String, _] */](name: String, attributes: Partial[T], innerBlocks: js.Array[BlockInstance[StringDictionary[_]]]): BlockInstance[T] = js.native
}

