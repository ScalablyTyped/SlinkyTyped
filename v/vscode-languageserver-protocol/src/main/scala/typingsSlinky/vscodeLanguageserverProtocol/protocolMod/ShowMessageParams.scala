package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowMessageParams extends StObject {
  
  /**
    * The actual message
    */
  var message: String = js.native
  
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType = js.native
}
object ShowMessageParams {
  
  @scala.inline
  def apply(message: String, `type`: MessageType): ShowMessageParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMessageParams]
  }
  
  @scala.inline
  implicit class ShowMessageParamsMutableBuilder[Self <: ShowMessageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
