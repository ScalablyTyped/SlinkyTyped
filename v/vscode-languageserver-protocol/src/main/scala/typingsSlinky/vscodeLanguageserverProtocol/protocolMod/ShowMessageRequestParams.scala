package typingsSlinky.vscodeLanguageserverProtocol.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowMessageRequestParams extends js.Object {
  
  /**
    * The message action items to present.
    */
  var actions: js.UndefOr[js.Array[MessageActionItem]] = js.native
  
  /**
    * The actual message
    */
  var message: String = js.native
  
  /**
    * The message type. See {@link MessageType}
    */
  var `type`: MessageType = js.native
}
object ShowMessageRequestParams {
  
  @scala.inline
  def apply(message: String, `type`: MessageType): ShowMessageRequestParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowMessageRequestParams]
  }
  
  @scala.inline
  implicit class ShowMessageRequestParamsOps[Self <: ShowMessageRequestParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MessageType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: MessageActionItem*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[MessageActionItem]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
  }
}
