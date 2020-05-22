package typingsSlinky.voximplantWebsdk.mod.CallEventTypes

import typingsSlinky.voximplantWebsdk.mod.Call
import typingsSlinky.voximplantWebsdk.mod.VoxImplantCallEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *    Event dispatched when progress tone playback stops
  */
trait ProgressToneStop extends VoxImplantCallEvent {
  /**
    *    Call that dispatched the event
    */
  var call: Call
}

object ProgressToneStop {
  @scala.inline
  def apply(call: Call): ProgressToneStop = {
    val __obj = js.Dynamic.literal(call = call.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressToneStop]
  }
}

