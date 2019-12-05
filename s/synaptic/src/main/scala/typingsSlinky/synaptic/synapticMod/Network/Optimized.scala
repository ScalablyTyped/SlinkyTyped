package typingsSlinky.synaptic.synapticMod.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Optimized extends js.Object {
  var memory: scala.scalajs.js.typedarray.Float64Array
  def ownership(memoryBuffer: scala.scalajs.js.typedarray.Float64Array): Unit
}

object Optimized {
  @scala.inline
  def apply(
    memory: scala.scalajs.js.typedarray.Float64Array,
    ownership: scala.scalajs.js.typedarray.Float64Array => Unit
  ): Optimized = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], ownership = js.Any.fromFunction1(ownership))
  
    __obj.asInstanceOf[Optimized]
  }
}

