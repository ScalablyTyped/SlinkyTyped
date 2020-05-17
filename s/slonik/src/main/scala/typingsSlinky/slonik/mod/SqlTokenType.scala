package typingsSlinky.slonik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.slonik.mod.ArraySqlTokenType
  - typingsSlinky.slonik.mod.BinarySqlTokenType
  - typingsSlinky.slonik.mod.IdentifierSqlTokenType
  - typingsSlinky.slonik.mod.JsonSqlTokenType
  - typingsSlinky.slonik.mod.ListSqlTokenType
  - typingsSlinky.slonik.mod.SqlSqlTokenType[js.Any]
  - typingsSlinky.slonik.mod.UnnestSqlTokenType
*/
trait SqlTokenType extends ValueExpressionType

object SqlTokenType {
  @scala.inline
  implicit def apply(value: ArraySqlTokenType): SqlTokenType = value.asInstanceOf[SqlTokenType]
  @scala.inline
  implicit def apply(value: BinarySqlTokenType): SqlTokenType = value.asInstanceOf[SqlTokenType]
  @scala.inline
  implicit def apply(value: IdentifierSqlTokenType): SqlTokenType = value.asInstanceOf[SqlTokenType]
  @scala.inline
  implicit def apply(value: JsonSqlTokenType): SqlTokenType = value.asInstanceOf[SqlTokenType]
  @scala.inline
  implicit def apply(value: ListSqlTokenType): SqlTokenType = value.asInstanceOf[SqlTokenType]
  @scala.inline
  implicit def apply(value: SqlSqlTokenType[js.Any]): SqlTokenType = value.asInstanceOf[SqlTokenType]
  @scala.inline
  implicit def apply(value: UnnestSqlTokenType): SqlTokenType = value.asInstanceOf[SqlTokenType]
}

