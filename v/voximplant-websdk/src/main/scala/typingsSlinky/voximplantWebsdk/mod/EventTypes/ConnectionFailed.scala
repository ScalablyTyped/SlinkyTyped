package typingsSlinky.voximplantWebsdk.mod.EventTypes

import typingsSlinky.voximplantWebsdk.mod.VoxImplantEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched if connection to VoxImplant Cloud couldn't be established. See connect function
		*/
@js.native
trait ConnectionFailed extends VoxImplantEvent {
  /**
  			*	Failure reason description
  			*/
  var message: String = js.native
}

object ConnectionFailed {
  @scala.inline
  def apply(message: String): ConnectionFailed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionFailed]
  }
  @scala.inline
  implicit class ConnectionFailedOps[Self <: ConnectionFailed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

