package typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.CallEventTypes

import typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.Call
import typingsSlinky.voximplantDashWebsdk.voximplantDashWebsdkMod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when text message is received
		*/
trait MessageReceived extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
  /**
  			*	Content of the message
  			*/
  var text: String
}

object MessageReceived {
  @scala.inline
  def apply(call: Call, text: String): MessageReceived = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MessageReceived]
  }
}

