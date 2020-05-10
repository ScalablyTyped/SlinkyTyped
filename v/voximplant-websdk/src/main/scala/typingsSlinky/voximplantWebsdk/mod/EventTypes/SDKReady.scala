package typingsSlinky.voximplantWebsdk.mod.EventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched after SDK was successfully initialized after init function call
		*/
@js.native
trait SDKReady extends VoxImplantEvent {
  /**
  			*	SDK version
  			*/
  var version: String = js.native
}

object SDKReady {
  @scala.inline
  def apply(version: String): SDKReady = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDKReady]
  }
  @scala.inline
  implicit class SDKReadyOps[Self <: SDKReady] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

