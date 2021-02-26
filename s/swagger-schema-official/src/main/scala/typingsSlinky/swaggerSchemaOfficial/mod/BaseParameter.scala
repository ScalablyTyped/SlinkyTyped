package typingsSlinky.swaggerSchemaOfficial.mod

import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.body
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.formData
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.header
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.path
import typingsSlinky.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseParameter extends StObject {
  
  var description: js.UndefOr[String] = js.native
  
  var in: body | query | path | header | formData = js.native
  
  var name: String = js.native
  
  var required: js.UndefOr[Boolean] = js.native
}
object BaseParameter {
  
  @scala.inline
  def apply(in: body | query | path | header | formData, name: String): BaseParameter = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseParameter]
  }
  
  @scala.inline
  implicit class BaseParameterMutableBuilder[Self <: BaseParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIn(value: body | query | path | header | formData): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
  }
}
