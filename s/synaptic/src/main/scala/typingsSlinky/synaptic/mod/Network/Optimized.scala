package typingsSlinky.synaptic.mod.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimized extends js.Object {
  var memory: js.typedarray.Float64Array
  def ownership(memoryBuffer: js.typedarray.Float64Array): Unit
}

object Optimized {
  @scala.inline
  def apply(memory: js.typedarray.Float64Array, ownership: js.typedarray.Float64Array => Unit): Optimized = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], ownership = js.Any.fromFunction1(ownership))
    __obj.asInstanceOf[Optimized]
  }
}

