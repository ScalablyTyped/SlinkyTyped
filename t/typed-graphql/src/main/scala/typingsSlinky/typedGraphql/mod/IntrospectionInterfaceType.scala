package typingsSlinky.typedGraphql.mod

import typingsSlinky.typedGraphql.typedGraphqlStrings.INTERFACE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IntrospectionInterfaceType extends IntrospectionType {
  
  var description: js.UndefOr[String] = js.native
  
  var fields: js.Array[IntrospectionField] = js.native
  
  var kind: INTERFACE = js.native
  
  var name: String = js.native
  
  var possibleTypes: js.Array[IntrospectionNamedTypeRef] = js.native
}
object IntrospectionInterfaceType {
  
  @scala.inline
  def apply(
    fields: js.Array[IntrospectionField],
    kind: INTERFACE,
    name: String,
    possibleTypes: js.Array[IntrospectionNamedTypeRef]
  ): IntrospectionInterfaceType = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], possibleTypes = possibleTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionInterfaceType]
  }
  
  @scala.inline
  implicit class IntrospectionInterfaceTypeMutableBuilder[Self <: IntrospectionInterfaceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[IntrospectionField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: IntrospectionField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: INTERFACE): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleTypes(value: js.Array[IntrospectionNamedTypeRef]): Self = StObject.set(x, "possibleTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleTypesVarargs(value: IntrospectionNamedTypeRef*): Self = StObject.set(x, "possibleTypes", js.Array(value :_*))
  }
}
