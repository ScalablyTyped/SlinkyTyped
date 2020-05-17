package typingsSlinky.vexdb.requestObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.Array[java.lang.String]
  - typingsSlinky.std.RegExp
  - typingsSlinky.vexdb.requestObjectsMod.StringRequestValidatorFunction
*/
trait StringRequest extends js.Object

object StringRequest {
  @scala.inline
  implicit def apply(value: js.Array[String]): StringRequest = value.asInstanceOf[StringRequest]
  @scala.inline
  implicit def apply(value: js.RegExp): StringRequest = value.asInstanceOf[StringRequest]
  @scala.inline
  implicit def apply(value: String): StringRequest = value.asInstanceOf[StringRequest]
  @scala.inline
  implicit def apply(value: StringRequestValidatorFunction): StringRequest = value.asInstanceOf[StringRequest]
}

