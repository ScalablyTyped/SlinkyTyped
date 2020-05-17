package typingsSlinky.tensorflowTfjsData.statisticsMod

import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
  - typingsSlinky.tensorflowTfjsCore.tensorMod.Tensor[typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank]
  - java.lang.String
*/
trait ElementArray extends js.Object

object ElementArray {
  @scala.inline
  implicit def apply(value: js.Array[Double]): ElementArray = value.asInstanceOf[ElementArray]
  @scala.inline
  implicit def apply(value: Double): ElementArray = value.asInstanceOf[ElementArray]
  @scala.inline
  implicit def apply(value: String): ElementArray = value.asInstanceOf[ElementArray]
  @scala.inline
  implicit def apply(value: Tensor[Rank]): ElementArray = value.asInstanceOf[ElementArray]
}

