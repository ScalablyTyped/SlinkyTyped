package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.INPUT_OBJECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionInputObjectType extends IntrospectionType {
  
  var description: js.UndefOr[String] = js.native
  
  var inputFields: js.Array[IntrospectionInputValue] = js.native
  
  var kind: INPUT_OBJECT = js.native
  
  var name: String = js.native
}
object IntrospectionInputObjectType {
  
  @scala.inline
  def apply(inputFields: js.Array[IntrospectionInputValue], kind: INPUT_OBJECT, name: String): IntrospectionInputObjectType = {
    val __obj = js.Dynamic.literal(inputFields = inputFields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInputObjectType]
  }
  
  @scala.inline
  implicit class IntrospectionInputObjectTypeMutableBuilder[Self <: IntrospectionInputObjectType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInputFields(value: js.Array[IntrospectionInputValue]): Self = StObject.set(x, "inputFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputFieldsVarargs(value: IntrospectionInputValue*): Self = StObject.set(x, "inputFields", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: INPUT_OBJECT): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
