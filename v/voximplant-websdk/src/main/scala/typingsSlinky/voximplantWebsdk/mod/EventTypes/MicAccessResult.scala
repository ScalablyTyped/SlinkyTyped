package typingsSlinky.voximplantWebsdk.mod.EventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after user interaction with the mic access dialog.
		*/
@js.native
trait MicAccessResult extends VoxImplantEvent {
  /**
  			*	True is access was allowed, false - otherwise
  			*/
  var result: Boolean = js.native
}

object MicAccessResult {
  @scala.inline
  def apply(result: Boolean): MicAccessResult = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[MicAccessResult]
  }
  @scala.inline
  implicit class MicAccessResultOps[Self <: MicAccessResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResult(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

