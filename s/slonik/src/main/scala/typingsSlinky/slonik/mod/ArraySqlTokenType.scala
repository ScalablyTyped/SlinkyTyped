package typingsSlinky.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArraySqlTokenType extends _SqlTokenType {
  
  var memberType: TypeNameIdentifierType | SqlTokenType = js.native
  
  var `type`: js.Symbol = js.native
  
  var values: js.Array[ValueExpressionType] = js.native
}
object ArraySqlTokenType {
  
  @scala.inline
  def apply(
    memberType: TypeNameIdentifierType | SqlTokenType,
    `type`: js.Symbol,
    values: js.Array[ValueExpressionType]
  ): ArraySqlTokenType = {
    val __obj = js.Dynamic.literal(memberType = memberType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArraySqlTokenType]
  }
  
  @scala.inline
  implicit class ArraySqlTokenTypeMutableBuilder[Self <: ArraySqlTokenType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMemberType(value: TypeNameIdentifierType | SqlTokenType): Self = StObject.set(x, "memberType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Symbol): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[ValueExpressionType]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: ValueExpressionType*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
