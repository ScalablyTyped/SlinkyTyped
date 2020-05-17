package typingsSlinky.sqlJs.moduleMod.SqlJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typingsSlinky.std.Uint8Array
  - scala.Null
*/
trait ValueType extends js.Object

object ValueType {
  @scala.inline
  implicit def apply(value: Double): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: Null): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: String): ValueType = value.asInstanceOf[ValueType]
  @scala.inline
  implicit def apply(value: js.typedarray.Uint8Array): ValueType = value.asInstanceOf[ValueType]
}

