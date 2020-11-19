package typingsSlinky.winrtUwp.Windows.ApplicationModel.Chat

import typingsSlinky.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsSlinky.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Rich Communication Services (RCS) end user message. */
@js.native
trait RcsEndUserMessage extends js.Object {
  
  /** Gets the actions to which the user can respond. */
  var actions: IVectorView[RcsEndUserMessageAction] = js.native
  
  /** Gets a Boolean value that specifies whether a PIN is required to be sent back with the response. */
  var isPinRequired: Boolean = js.native
  
  /**
    * Asynchronously sends the user's selection back.
    * @param action Specifies the label of the action.
    * @return An async action indicating that the operation has completed.
    */
  def sendResponseAsync(action: RcsEndUserMessageAction): IPromiseWithIAsyncAction = js.native
  
  /**
    * Asynchronously sends the user's selection back with the specified PIN.
    * @param action Specifies the label of the action.
    * @param pin The PIN to send.
    * @return An async action indicating that the operation has completed.
    */
  def sendResponseWithPinAsync(action: RcsEndUserMessageAction, pin: String): IPromiseWithIAsyncAction = js.native
  
  /** Gets the contents of the message. */
  var text: String = js.native
  
  /** Gets the title of the message. */
  var title: String = js.native
  
  /** Gets the ID of the transport where this message originated. */
  var transportId: String = js.native
}
object RcsEndUserMessage {
  
  @scala.inline
  def apply(
    actions: IVectorView[RcsEndUserMessageAction],
    isPinRequired: Boolean,
    sendResponseAsync: RcsEndUserMessageAction => IPromiseWithIAsyncAction,
    sendResponseWithPinAsync: (RcsEndUserMessageAction, String) => IPromiseWithIAsyncAction,
    text: String,
    title: String,
    transportId: String
  ): RcsEndUserMessage = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], isPinRequired = isPinRequired.asInstanceOf[js.Any], sendResponseAsync = js.Any.fromFunction1(sendResponseAsync), sendResponseWithPinAsync = js.Any.fromFunction2(sendResponseWithPinAsync), text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessage]
  }
  
  @scala.inline
  implicit class RcsEndUserMessageOps[Self <: RcsEndUserMessage] (val x: Self) extends AnyVal {
    
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
    def setActions(value: IVectorView[RcsEndUserMessageAction]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPinRequired(value: Boolean): Self = this.set("isPinRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendResponseAsync(value: RcsEndUserMessageAction => IPromiseWithIAsyncAction): Self = this.set("sendResponseAsync", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendResponseWithPinAsync(value: (RcsEndUserMessageAction, String) => IPromiseWithIAsyncAction): Self = this.set("sendResponseWithPinAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportId(value: String): Self = this.set("transportId", value.asInstanceOf[js.Any])
  }
}
