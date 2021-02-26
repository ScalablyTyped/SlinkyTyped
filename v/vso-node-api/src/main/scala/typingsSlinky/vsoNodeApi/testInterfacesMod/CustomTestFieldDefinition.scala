package typingsSlinky.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomTestFieldDefinition extends StObject {
  
  var fieldId: Double = js.native
  
  var fieldName: String = js.native
  
  var fieldType: CustomTestFieldType = js.native
  
  var scope: CustomTestFieldScope = js.native
}
object CustomTestFieldDefinition {
  
  @scala.inline
  def apply(fieldId: Double, fieldName: String, fieldType: CustomTestFieldType, scope: CustomTestFieldScope): CustomTestFieldDefinition = {
    val __obj = js.Dynamic.literal(fieldId = fieldId.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], fieldType = fieldType.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomTestFieldDefinition]
  }
  
  @scala.inline
  implicit class CustomTestFieldDefinitionMutableBuilder[Self <: CustomTestFieldDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFieldId(value: Double): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: CustomTestFieldType): Self = StObject.set(x, "fieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: CustomTestFieldScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
  }
}
