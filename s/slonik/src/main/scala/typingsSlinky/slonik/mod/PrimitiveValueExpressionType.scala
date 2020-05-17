package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - scala.Double
  - scala.Boolean
  - scala.Null
  - typingsSlinky.slonik.mod.PrimitiveValueExpressionTypeArray
*/
trait PrimitiveValueExpressionType extends ValueExpressionType

object PrimitiveValueExpressionType {
  @scala.inline
  implicit def apply(value: Boolean): PrimitiveValueExpressionType = value.asInstanceOf[PrimitiveValueExpressionType]
  @scala.inline
  implicit def apply(value: Double): PrimitiveValueExpressionType = value.asInstanceOf[PrimitiveValueExpressionType]
  @scala.inline
  implicit def apply(value: Null): PrimitiveValueExpressionType = value.asInstanceOf[PrimitiveValueExpressionType]
  @scala.inline
  implicit def apply(value: PrimitiveValueExpressionTypeArray): PrimitiveValueExpressionType = value.asInstanceOf[PrimitiveValueExpressionType]
  @scala.inline
  implicit def apply(value: String): PrimitiveValueExpressionType = value.asInstanceOf[PrimitiveValueExpressionType]
}

