package typingsSlinky.tensorflowTfjsLayers.anon

import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecipientMap extends js.Object {
  var recipientMap: typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap = js.native
  var sorted: js.Array[SymbolicTensor] = js.native
}

object RecipientMap {
  @scala.inline
  def apply(
    recipientMap: typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap,
    sorted: js.Array[SymbolicTensor]
  ): RecipientMap = {
    val __obj = js.Dynamic.literal(recipientMap = recipientMap.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecipientMap]
  }
  @scala.inline
  implicit class RecipientMapOps[Self <: RecipientMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipientMap(value: typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipientMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSorted(value: js.Array[SymbolicTensor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sorted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

