package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRecipientMap extends js.Object {
  var recipientMap: RecipientMap
  var sorted: js.Array[SymbolicTensor]
}

object AnonRecipientMap {
  @scala.inline
  def apply(recipientMap: RecipientMap, sorted: js.Array[SymbolicTensor]): AnonRecipientMap = {
    val __obj = js.Dynamic.literal(recipientMap = recipientMap.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRecipientMap]
  }
}

