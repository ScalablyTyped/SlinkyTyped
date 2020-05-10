package typingsSlinky.voximplantWebsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait VoxImplantEvent extends js.Object

object VoxImplantEvent {
  @scala.inline
  def NetStatsReceived(stats: NetworkInfo): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def ConnectionFailed(message: String): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def AuthResult(result: Boolean): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def IncomingCall(call: Call): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def SDKReady(version: String): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
  @scala.inline
  def MicAccessResult(result: Boolean): VoxImplantEvent = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoxImplantEvent]
  }
}

