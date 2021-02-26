package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildDefinitionSourceProvider extends StObject {
  
  /**
    * Uri of the associated definition
    */
  var definitionUri: String = js.native
  
  /**
    * fields associated with this build definition
    */
  var fields: StringDictionary[String] = js.native
  
  /**
    * Id of this source provider
    */
  var id: Double = js.native
  
  /**
    * The lst time this source provider was modified
    */
  var lastModified: js.Date = js.native
  
  /**
    * Name of the source provider
    */
  var name: String = js.native
  
  /**
    * Which trigger types are supported by this definition source provider
    */
  var supportedTriggerTypes: DefinitionTriggerType = js.native
}
object BuildDefinitionSourceProvider {
  
  @scala.inline
  def apply(
    definitionUri: String,
    fields: StringDictionary[String],
    id: Double,
    lastModified: js.Date,
    name: String,
    supportedTriggerTypes: DefinitionTriggerType
  ): BuildDefinitionSourceProvider = {
    val __obj = js.Dynamic.literal(definitionUri = definitionUri.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedTriggerTypes = supportedTriggerTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildDefinitionSourceProvider]
  }
  
  @scala.inline
  implicit class BuildDefinitionSourceProviderMutableBuilder[Self <: BuildDefinitionSourceProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinitionUri(value: String): Self = StObject.set(x, "definitionUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: StringDictionary[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModified(value: js.Date): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTriggerTypes(value: DefinitionTriggerType): Self = StObject.set(x, "supportedTriggerTypes", value.asInstanceOf[js.Any])
  }
}
