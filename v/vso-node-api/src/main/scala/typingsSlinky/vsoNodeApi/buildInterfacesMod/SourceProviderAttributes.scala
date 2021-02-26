package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceProviderAttributes extends StObject {
  
  /**
    * The name of the source provider.
    */
  var name: String = js.native
  
  /**
    * The capabilities supported by this source provider.
    */
  var supportedCapabilities: StringDictionary[Boolean] = js.native
  
  /**
    * The types of triggers supported by this source provider.
    */
  var supportedTriggers: js.Array[SupportedTrigger] = js.native
}
object SourceProviderAttributes {
  
  @scala.inline
  def apply(
    name: String,
    supportedCapabilities: StringDictionary[Boolean],
    supportedTriggers: js.Array[SupportedTrigger]
  ): SourceProviderAttributes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportedCapabilities = supportedCapabilities.asInstanceOf[js.Any], supportedTriggers = supportedTriggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProviderAttributes]
  }
  
  @scala.inline
  implicit class SourceProviderAttributesMutableBuilder[Self <: SourceProviderAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCapabilities(value: StringDictionary[Boolean]): Self = StObject.set(x, "supportedCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTriggers(value: js.Array[SupportedTrigger]): Self = StObject.set(x, "supportedTriggers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedTriggersVarargs(value: SupportedTrigger*): Self = StObject.set(x, "supportedTriggers", js.Array(value :_*))
  }
}
