package typingsSlinky.vexdb.requestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - js.Array[scala.Double]
  - typingsSlinky.vexdb.requestObjectsMod.NumberRequestValidatorFunction
*/
trait NumberRequest extends js.Object

object NumberRequest {
  @scala.inline
  implicit def apply(value: js.Array[Double]): NumberRequest = value.asInstanceOf[NumberRequest]
  @scala.inline
  implicit def apply(value: Double): NumberRequest = value.asInstanceOf[NumberRequest]
  @scala.inline
  implicit def apply(value: NumberRequestValidatorFunction): NumberRequest = value.asInstanceOf[NumberRequest]
}

