package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.AuthResult
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionClosed
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionEstablished
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionFailed
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.IncomingCall
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.MicAccessResult
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.NetStatsReceived
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.PlaybackFinished
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.SDKReady
  - typingsSlinky.voximplantWebsdk.mod.EventTypes.SourcesInfoUpdated
*/
trait VoxImplantEvent extends StObject
object VoxImplantEvent {
  
  @scala.inline
  def AuthResult(result: Boolean): typingsSlinky.voximplantWebsdk.mod.EventTypes.AuthResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.EventTypes.AuthResult]
  }
  
  @scala.inline
  def ConnectionFailed(message: String): typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionFailed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionFailed]
  }
  
  @scala.inline
  def IncomingCall(call: Call): typingsSlinky.voximplantWebsdk.mod.EventTypes.IncomingCall = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.EventTypes.IncomingCall]
  }
  
  @scala.inline
  def MicAccessResult(result: Boolean): typingsSlinky.voximplantWebsdk.mod.EventTypes.MicAccessResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.EventTypes.MicAccessResult]
  }
  
  @scala.inline
  def NetStatsReceived(stats: NetworkInfo): typingsSlinky.voximplantWebsdk.mod.EventTypes.NetStatsReceived = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.EventTypes.NetStatsReceived]
  }
  
  @scala.inline
  def SDKReady(version: String): typingsSlinky.voximplantWebsdk.mod.EventTypes.SDKReady = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.voximplantWebsdk.mod.EventTypes.SDKReady]
  }
}
