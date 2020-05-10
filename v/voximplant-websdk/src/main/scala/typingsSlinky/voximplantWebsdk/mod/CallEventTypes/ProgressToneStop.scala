package typingsSlinky.voximplantWebsdk.mod.CallEventTypes

import typingsSlinky.voximplantWebsdk.mod.Call
import typingsSlinky.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when progress tone playback stops
		*/
@js.native
trait ProgressToneStop extends VoxImplantCallEvent {
  /**
  			*	Call that dispatched the event
  			*/
  var call: Call = js.native
}

object ProgressToneStop {
  @scala.inline
  def apply(call: Call): ProgressToneStop = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressToneStop]
  }
  @scala.inline
  implicit class ProgressToneStopOps[Self <: ProgressToneStop] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall(value: Call): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

