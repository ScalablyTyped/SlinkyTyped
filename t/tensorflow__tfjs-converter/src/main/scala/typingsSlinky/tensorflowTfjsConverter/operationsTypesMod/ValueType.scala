package typingsSlinky.tensorflowTfjsConverter.operationsTypesMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[
js.Array[scala.Double] | scala.Boolean | scala.Double | java.lang.String | typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]]
  - scala.Double
  - scala.Boolean
  - typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  implicit def apply(value: js.Array[js.Array[Double] | Boolean | Double | String | Tensor[Rank]]): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Boolean): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Double): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: String): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Tensor[Rank]): ValueType = value.asInstanceOf[ValueType]
}

