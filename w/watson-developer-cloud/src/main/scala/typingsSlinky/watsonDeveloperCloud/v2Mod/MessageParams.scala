package typingsSlinky.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Parameters for the `message` operation. */
@js.native
trait MessageParams extends StObject {
  
  /** Unique identifier of the assistant. You can find the assistant ID of an assistant on the **Assistants** tab of the Watson Assistant tool. For information about creating assistants, see the [documentation](https://console.bluemix.net/docs/services/assistant/assistant-add.html#assistant-add-task). **Note:** Currently, the v2 API does not support creating assistants. */
  var assistant_id: String = js.native
  
  /** State information for the conversation. The context is stored by the assistant on a per-session basis. You can use this property to set or modify context variables, which can also be accessed by dialog nodes. */
  var context: js.UndefOr[MessageContext] = js.native
  
  var headers: js.UndefOr[js.Object] = js.native
  
  /** An input object that includes the input text. */
  var input: js.UndefOr[MessageInput] = js.native
  
  var return_response: js.UndefOr[Boolean] = js.native
  
  /** Unique identifier of the session. */
  var session_id: String = js.native
}
object MessageParams {
  
  @scala.inline
  def apply(assistant_id: String, session_id: String): MessageParams = {
    val __obj = js.Dynamic.literal(assistant_id = assistant_id.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageParams]
  }
  
  @scala.inline
  implicit class MessageParamsMutableBuilder[Self <: MessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssistant_id(value: String): Self = StObject.set(x, "assistant_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: MessageContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    @scala.inline
    def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setInput(value: MessageInput): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    @scala.inline
    def setReturn_response(value: Boolean): Self = StObject.set(x, "return_response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturn_responseUndefined: Self = StObject.set(x, "return_response", js.undefined)
    
    @scala.inline
    def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
  }
}
