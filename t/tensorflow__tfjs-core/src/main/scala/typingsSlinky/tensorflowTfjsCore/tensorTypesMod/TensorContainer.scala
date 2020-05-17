package typingsSlinky.tensorflowTfjsCore.tensorTypesMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Unit
  - typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainerObject
  - typingsSlinky.tensorflowTfjsCore.tensorTypesMod.TensorContainerArray
  - typingsSlinky.std.Float32Array
  - typingsSlinky.std.Int32Array
  - typingsSlinky.std.Uint8Array
*/
trait TensorContainer extends js.Object

object TensorContainer {
  @scala.inline
  implicit def apply(value: Boolean): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: Double): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: js.typedarray.Float32Array): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: js.typedarray.Int32Array): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: String): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: Tensor[Rank]): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: TensorContainerArray): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: TensorContainerObject): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): TensorContainer = value.asInstanceOf[TensorContainer]
  @scala.inline
  implicit def apply(value: Unit): TensorContainer = value.asInstanceOf[TensorContainer]
}

