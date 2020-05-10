package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonRecipientMap extends js.Object {
  var recipientMap: RecipientMap = js.native
  var sorted: js.Array[SymbolicTensor] = js.native
}

object AnonRecipientMap {
  @scala.inline
  def apply(recipientMap: RecipientMap, sorted: js.Array[SymbolicTensor]): AnonRecipientMap = {
    val __obj = js.Dynamic.literal(recipientMap = recipientMap.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRecipientMap]
  }
  @scala.inline
  implicit class AnonRecipientMapOps[Self <: AnonRecipientMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRecipientMap(value: RecipientMap): Self = {
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

