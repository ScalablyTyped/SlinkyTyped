package typingsSlinky.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Assistant output to be rendered or processed by the client. */
@js.native
trait MessageOutput extends StObject {
  
  /** An array of objects describing any actions requested by the dialog node. */
  var actions: js.UndefOr[js.Array[DialogNodeAction]] = js.native
  
  /** Additional detailed information about a message response and how it was generated. */
  var debug: js.UndefOr[MessageOutputDebug] = js.native
  
  /** An array of entities identified in the user input. */
  var entities: js.UndefOr[js.Array[RuntimeEntity]] = js.native
  
  /** Output intended for any channel. It is the responsibility of the client application to implement the supported response types. */
  var generic: js.UndefOr[js.Array[DialogRuntimeResponseGeneric]] = js.native
  
  /** An array of intents recognized in the user input, sorted in descending order of confidence. */
  var intents: js.UndefOr[js.Array[RuntimeIntent]] = js.native
  
  /** An object containing any custom properties included in the response. This object includes any arbitrary properties defined in the dialog JSON editor as part of the dialog node output. */
  var user_defined: js.UndefOr[js.Object] = js.native
}
object MessageOutput {
  
  @scala.inline
  def apply(): MessageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageOutput]
  }
  
  @scala.inline
  implicit class MessageOutputMutableBuilder[Self <: MessageOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: js.Array[DialogNodeAction]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setActionsVarargs(value: DialogNodeAction*): Self = StObject.set(x, "actions", js.Array(value :_*))
    
    @scala.inline
    def setDebug(value: MessageOutputDebug): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Array[RuntimeEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: RuntimeEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setGeneric(value: js.Array[DialogRuntimeResponseGeneric]): Self = StObject.set(x, "generic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericUndefined: Self = StObject.set(x, "generic", js.undefined)
    
    @scala.inline
    def setGenericVarargs(value: DialogRuntimeResponseGeneric*): Self = StObject.set(x, "generic", js.Array(value :_*))
    
    @scala.inline
    def setIntents(value: js.Array[RuntimeIntent]): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    @scala.inline
    def setIntentsVarargs(value: RuntimeIntent*): Self = StObject.set(x, "intents", js.Array(value :_*))
    
    @scala.inline
    def setUser_defined(value: js.Object): Self = StObject.set(x, "user_defined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser_definedUndefined: Self = StObject.set(x, "user_defined", js.undefined)
  }
}
