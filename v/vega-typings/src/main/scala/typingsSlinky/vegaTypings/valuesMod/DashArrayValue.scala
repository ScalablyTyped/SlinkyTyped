package typingsSlinky.vegaTypings.valuesMod

import typingsSlinky.vegaTypings.encodeMod.ArrayValueRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Array[scala.Double]
  - typingsSlinky.vegaTypings.encodeMod.ArrayValueRef
*/
trait DashArrayValue extends js.Object

object DashArrayValue {
  @scala.inline
  implicit def apply(value: js.Array[Double]): DashArrayValue = value.asInstanceOf[DashArrayValue]
  @scala.inline
  implicit def apply(value: ArrayValueRef): DashArrayValue = value.asInstanceOf[DashArrayValue]
}

