package typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CallEvents extends js.Object

/**
	*	VoxImplant.Call events
	*/
@JSImport("voximplant-websdk", "CallEvents")
@js.native
object CallEvents extends js.Object {
  @js.native
  sealed trait Connected extends CallEvents
  
  @js.native
  sealed trait Disconnected extends CallEvents
  
  @js.native
  sealed trait Failed extends CallEvents
  
  @js.native
  sealed trait ICETimeout extends CallEvents
  
  @js.native
  sealed trait InfoReceived extends CallEvents
  
  @js.native
  sealed trait MessageReceived extends CallEvents
  
  @js.native
  sealed trait ProgressToneStart extends CallEvents
  
  @js.native
  sealed trait ProgressToneStop extends CallEvents
  
  @js.native
  sealed trait TransferComplete extends CallEvents
  
  @js.native
  sealed trait TransferFailed extends CallEvents
  
  /* 0 */ val Connected: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.Connected with Double = js.native
  /* 1 */ val Disconnected: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.Disconnected with Double = js.native
  /* 2 */ val Failed: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.Failed with Double = js.native
  /* 3 */ val ICETimeout: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.ICETimeout with Double = js.native
  /* 4 */ val InfoReceived: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.InfoReceived with Double = js.native
  /* 5 */ val MessageReceived: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.MessageReceived with Double = js.native
  /* 6 */ val ProgressToneStart: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.ProgressToneStart with Double = js.native
  /* 7 */ val ProgressToneStop: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.ProgressToneStop with Double = js.native
  /* 8 */ val TransferComplete: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.TransferComplete with Double = js.native
  /* 9 */ val TransferFailed: typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEvents.TransferFailed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CallEvents with Double] = js.native
}

