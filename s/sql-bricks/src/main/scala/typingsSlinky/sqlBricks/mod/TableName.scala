package typingsSlinky.sqlBricks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.sqlBricks.mod.SelectStatement
*/
trait TableName extends js.Object

object TableName {
  @scala.inline
  implicit def apply(value: SelectStatement): TableName = value.asInstanceOf[TableName]
  @scala.inline
  implicit def apply(value: String): TableName = value.asInstanceOf[TableName]
}

