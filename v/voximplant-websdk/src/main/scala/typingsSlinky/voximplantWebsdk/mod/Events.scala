package typingsSlinky.voximplantWebsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Events extends StObject
/**
  *    VoxImplant.Client general events
  */
@JSImport("voximplant-websdk", "Events")
@js.native
object Events extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Events with Double] = js.native
  
  @js.native
  sealed trait AuthResult extends Events
  /* 0 */ val AuthResult: typingsSlinky.voximplantWebsdk.mod.Events.AuthResult with Double = js.native
  
  @js.native
  sealed trait ConnectionClosed extends Events
  /* 1 */ val ConnectionClosed: typingsSlinky.voximplantWebsdk.mod.Events.ConnectionClosed with Double = js.native
  
  @js.native
  sealed trait ConnectionEstablished extends Events
  /* 2 */ val ConnectionEstablished: typingsSlinky.voximplantWebsdk.mod.Events.ConnectionEstablished with Double = js.native
  
  @js.native
  sealed trait ConnectionFailed extends Events
  /* 3 */ val ConnectionFailed: typingsSlinky.voximplantWebsdk.mod.Events.ConnectionFailed with Double = js.native
  
  @js.native
  sealed trait IncomingCall extends Events
  /* 4 */ val IncomingCall: typingsSlinky.voximplantWebsdk.mod.Events.IncomingCall with Double = js.native
  
  @js.native
  sealed trait MicAccessResult extends Events
  /* 5 */ val MicAccessResult: typingsSlinky.voximplantWebsdk.mod.Events.MicAccessResult with Double = js.native
  
  @js.native
  sealed trait NetStatsReceived extends Events
  /* 6 */ val NetStatsReceived: typingsSlinky.voximplantWebsdk.mod.Events.NetStatsReceived with Double = js.native
  
  @js.native
  sealed trait PlaybackFinished extends Events
  /* 7 */ val PlaybackFinished: typingsSlinky.voximplantWebsdk.mod.Events.PlaybackFinished with Double = js.native
  
  @js.native
  sealed trait SDKReady extends Events
  /* 8 */ val SDKReady: typingsSlinky.voximplantWebsdk.mod.Events.SDKReady with Double = js.native
  
  @js.native
  sealed trait SourcesInfoUpdated extends Events
  /* 9 */ val SourcesInfoUpdated: typingsSlinky.voximplantWebsdk.mod.Events.SourcesInfoUpdated with Double = js.native
}
