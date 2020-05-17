package typingsSlinky.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Boolean | scala.Double]
  - typingsSlinky.tensorflowTfjsCore.distTypesMod.TypedArray
*/
trait FlatVector extends js.Object

object FlatVector {
  @scala.inline
  implicit def apply(value: js.Array[Boolean | Double]): FlatVector = value.asInstanceOf[FlatVector]
  @scala.inline
  implicit def apply(value: TypedArray): FlatVector = value.asInstanceOf[FlatVector]
}

