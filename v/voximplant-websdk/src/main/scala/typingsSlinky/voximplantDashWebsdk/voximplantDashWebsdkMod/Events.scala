package typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Events extends js.Object

/**
	*	VoxImplant.Client general events
	*/
@JSImport("voximplant-websdk", "Events")
@js.native
object Events extends js.Object {
  @js.native
  sealed trait AuthResult extends Events
  
  @js.native
  sealed trait ConnectionClosed extends Events
  
  @js.native
  sealed trait ConnectionEstablished extends Events
  
  @js.native
  sealed trait ConnectionFailed extends Events
  
  @js.native
  sealed trait IncomingCall extends Events
  
  @js.native
  sealed trait MicAccessResult extends Events
  
  @js.native
  sealed trait NetStatsReceived extends Events
  
  @js.native
  sealed trait PlaybackFinished extends Events
  
  @js.native
  sealed trait SDKReady extends Events
  
  @js.native
  sealed trait SourcesInfoUpdated extends Events
  
  /* 0 */ val AuthResult: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.AuthResult with Double = js.native
  /* 1 */ val ConnectionClosed: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.ConnectionClosed with Double = js.native
  /* 2 */ val ConnectionEstablished: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.ConnectionEstablished with Double = js.native
  /* 3 */ val ConnectionFailed: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.ConnectionFailed with Double = js.native
  /* 4 */ val IncomingCall: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.IncomingCall with Double = js.native
  /* 5 */ val MicAccessResult: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.MicAccessResult with Double = js.native
  /* 6 */ val NetStatsReceived: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.NetStatsReceived with Double = js.native
  /* 7 */ val PlaybackFinished: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.PlaybackFinished with Double = js.native
  /* 8 */ val SDKReady: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.SDKReady with Double = js.native
  /* 9 */ val SourcesInfoUpdated: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Events.SourcesInfoUpdated with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
}

