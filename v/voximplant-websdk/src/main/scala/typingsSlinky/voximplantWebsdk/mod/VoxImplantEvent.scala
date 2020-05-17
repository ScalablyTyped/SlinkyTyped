package typingsSlinky.voximplantWebsdk.mod

import typingsSlinky.voximplantWebsdk.mod.EventTypes.AuthResult
import typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionClosed
import typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionEstablished
import typingsSlinky.voximplantWebsdk.mod.EventTypes.ConnectionFailed
import typingsSlinky.voximplantWebsdk.mod.EventTypes.IncomingCall
import typingsSlinky.voximplantWebsdk.mod.EventTypes.MicAccessResult
import typingsSlinky.voximplantWebsdk.mod.EventTypes.NetStatsReceived
import typingsSlinky.voximplantWebsdk.mod.EventTypes.PlaybackFinished
import typingsSlinky.voximplantWebsdk.mod.EventTypes.SDKReady
import typingsSlinky.voximplantWebsdk.mod.EventTypes.SourcesInfoUpdated
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
  implicit def apply(value: AuthResult): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: ConnectionClosed): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: ConnectionEstablished): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: ConnectionFailed): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: IncomingCall): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: MicAccessResult): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: NetStatsReceived): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: PlaybackFinished): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: SDKReady): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
  @scala.inline
  implicit def apply(value: SourcesInfoUpdated): VoxImplantEvent = value.asInstanceOf[VoxImplantEvent]
}

