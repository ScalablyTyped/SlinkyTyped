package typingsSlinky.voximplantWebsdk.mod.CallEventTypes

import typingsSlinky.voximplantWebsdk.mod.Call
import typingsSlinky.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when progress tone playback starts
		*/
trait ProgressToneStart extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call
}

object ProgressToneStart {
  @scala.inline
  def apply(call: Call): ProgressToneStart = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProgressToneStart]
  }
}

