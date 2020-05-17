package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.slonik.mod.SqlTokenType
  - typingsSlinky.slonik.mod.PrimitiveValueExpressionType
*/
trait ValueExpressionType extends js.Object

object ValueExpressionType {
  @scala.inline
  implicit def apply(value: PrimitiveValueExpressionType): ValueExpressionType = value.asInstanceOf[ValueExpressionType]
  @scala.inline
  implicit def apply(value: SqlTokenType): ValueExpressionType = value.asInstanceOf[ValueExpressionType]
}

