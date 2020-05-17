package typingsSlinky.server.commonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[js.Any]
  - js.Object
  - scala.Double
*/
trait BasicType extends js.Object

object BasicType {
  @scala.inline
  implicit def apply(value: js.Array[js.Any]): BasicType = value.asInstanceOf[BasicType]
  @scala.inline
  implicit def apply(value: Double): BasicType = value.asInstanceOf[BasicType]
  @scala.inline
  implicit def apply(value: js.Object): BasicType = value.asInstanceOf[BasicType]
  @scala.inline
  implicit def apply(value: String): BasicType = value.asInstanceOf[BasicType]
}

