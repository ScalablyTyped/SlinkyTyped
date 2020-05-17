package typingsSlinky.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * When a non-expression object is passed somewhere a whereExpression is expected,
  * each key/value pair will be ANDed together:
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.sqlBricks.mod.WhereGroup
  - typingsSlinky.sqlBricks.mod.WhereBinary
  - typingsSlinky.sqlBricks.mod.WhereObject
  - java.lang.String
*/
trait WhereExpression extends js.Object

object WhereExpression {
  @scala.inline
  implicit def apply(value: String): WhereExpression = value.asInstanceOf[WhereExpression]
  @scala.inline
  implicit def apply(value: WhereBinary): WhereExpression = value.asInstanceOf[WhereExpression]
  @scala.inline
  implicit def apply(value: WhereGroup): WhereExpression = value.asInstanceOf[WhereExpression]
  @scala.inline
  implicit def apply(value: WhereObject): WhereExpression = value.asInstanceOf[WhereExpression]
}

