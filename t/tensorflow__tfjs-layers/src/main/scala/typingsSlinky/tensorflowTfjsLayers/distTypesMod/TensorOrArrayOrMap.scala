package typingsSlinky.tensorflowTfjsLayers.distTypesMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  - js.Array[
typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]]
  - typingsSlinky.tensorflowTfjsCore.tensorTypesMod.NamedTensorMap
*/
trait TensorOrArrayOrMap extends js.Object

object TensorOrArrayOrMap {
  @scala.inline
  implicit def apply(value: js.Array[Tensor[Rank]]): TensorOrArrayOrMap = value.asInstanceOf[TensorOrArrayOrMap]
  @scala.inline
  implicit def apply(value: NamedTensorMap): TensorOrArrayOrMap = value.asInstanceOf[TensorOrArrayOrMap]
  @scala.inline
  implicit def apply(value: Tensor[Rank]): TensorOrArrayOrMap = value.asInstanceOf[TensorOrArrayOrMap]
}

