package typingsSlinky.slonik.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait _SqlTokenType extends StObject
object _SqlTokenType {
  
  @scala.inline
  def ArraySqlTokenType(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): typingsSlinky.slonik.mod.ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.slonik.mod.ArraySqlTokenType]
  }
  
  @scala.inline
  def BinarySqlTokenType(data: Buffer, `type`: js.Symbol): typingsSlinky.slonik.mod.BinarySqlTokenType = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.slonik.mod.BinarySqlTokenType]
  }
  
  @scala.inline
  def IdentifierSqlTokenType(names: js.Array[String], `type`: js.Symbol): typingsSlinky.slonik.mod.IdentifierSqlTokenType = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.slonik.mod.IdentifierSqlTokenType]
  }
  
  @scala.inline
  def JsonSqlTokenType(`type`: js.Symbol): typingsSlinky.slonik.mod.JsonSqlTokenType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.slonik.mod.JsonSqlTokenType]
  }
  
  @scala.inline
  def ListSqlTokenType(glue: SqlTokenType, members: js.Array[SqlTokenType], `type`: js.Symbol): typingsSlinky.slonik.mod.ListSqlTokenType = {
    val __obj = js.Dynamic.literal(glue = glue.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.slonik.mod.ListSqlTokenType]
  }
  
  @scala.inline
  def UnnestSqlTokenType(columnTypes: js.Array[String], tuples: js.Array[js.Array[ValueExpressionType]], `type`: js.Symbol): typingsSlinky.slonik.mod.UnnestSqlTokenType = {
    val __obj = js.Dynamic.literal(columnTypes = columnTypes.asInstanceOf[js.Any], tuples = tuples.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.slonik.mod.UnnestSqlTokenType]
  }
}
