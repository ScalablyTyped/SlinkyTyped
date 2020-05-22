package typingsSlinky.std.WebAssembly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Memory extends _ExportValue {
  val buffer: js.typedarray.ArrayBuffer
  def grow(delta: Double): Double
}

object Memory {
  @scala.inline
  def apply(buffer: js.typedarray.ArrayBuffer, grow: Double => Double): Memory = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
    __obj.asInstanceOf[Memory]
  }
}

