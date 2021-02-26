package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Connected
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Disconnected
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Failed
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.InfoReceived
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.MessageReceived
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferComplete
  - typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferFailed
*/
trait VoxImplantCallEvent extends StObject
object VoxImplantCallEvent {
  
  @scala.inline
  def Connected(call: Call): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Connected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Connected]
  }
  
  @scala.inline
  def Disconnected(call: Call): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Disconnected = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Disconnected]
  }
  
  @scala.inline
  def Failed(call: Call, code: Double, reason: String): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Failed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.Failed]
  }
  
  @scala.inline
  def InfoReceived(body: String, call: Call, mimeType: String): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.InfoReceived = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], call = call.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.InfoReceived]
  }
  
  @scala.inline
  def MessageReceived(call: Call, text: String): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.MessageReceived = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.MessageReceived]
  }
  
  @scala.inline
  def ProgressToneStart(call: Call): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStart]
  }
  
  @scala.inline
  def ProgressToneStop(call: Call): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.ProgressToneStop]
  }
  
  @scala.inline
  def TransferComplete(call: Call): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferComplete = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferComplete]
  }
  
  @scala.inline
  def TransferFailed(call: Call): typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferFailed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.CallEventTypes.TransferFailed]
  }
}
