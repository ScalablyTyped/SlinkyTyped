package typingsSlinky.synaptic.mod.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Optimized extends js.Object {
  var memory: js.typedarray.Float64Array = js.native
  def ownership(memoryBuffer: js.typedarray.Float64Array): Unit = js.native
}

object Optimized {
  @scala.inline
  def apply(memory: js.typedarray.Float64Array, ownership: js.typedarray.Float64Array => Unit): Optimized = {
    val __obj = js.Dynamic.literal(memory = memory.asInstanceOf[js.Any], ownership = js.Any.fromFunction1(ownership))
    __obj.asInstanceOf[Optimized]
  }
  @scala.inline
  implicit class OptimizedOps[Self <: Optimized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMemory(value: js.typedarray.Float64Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("memory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnership(value: js.typedarray.Float64Array => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownership")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

