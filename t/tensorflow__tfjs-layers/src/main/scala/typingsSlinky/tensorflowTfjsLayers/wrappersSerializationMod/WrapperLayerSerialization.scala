package typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.TimeDistributedLayerSerialization
  - typingsSlinky.tensorflowTfjsLayers.wrappersSerializationMod.BidirectionalLayerSerialization
*/
trait WrapperLayerSerialization extends js.Object

object WrapperLayerSerialization {
  @scala.inline
  implicit def apply(value: BidirectionalLayerSerialization | TimeDistributedLayerSerialization): WrapperLayerSerialization = value.asInstanceOf[WrapperLayerSerialization]
}

