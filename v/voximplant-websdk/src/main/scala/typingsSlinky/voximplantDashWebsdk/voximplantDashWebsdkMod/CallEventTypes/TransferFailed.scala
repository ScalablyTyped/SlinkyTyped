package typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes

import typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when call transfer failed
		*/
trait TransferFailed extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
}

object TransferFailed {
  @scala.inline
  def apply(call: Call): TransferFailed = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransferFailed]
  }
}

