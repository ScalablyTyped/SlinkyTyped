package typingsSlinky.voximplantWebsdk.mod.IMEventTypes

import typingsSlinky.voximplantWebsdk.mod.RosterItem
import typingsSlinky.voximplantWebsdk.mod.VoxImplantIMEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		*	Event dispatched when roster data received
		*/
@js.native
trait RosterReceived extends VoxImplantIMEvent {
  /**
  			*	User id
  			*/
  var id: String = js.native
  /**
  			*	Array contains VoxImplant.RosterItem elements
  			*/
  var roster: js.Array[RosterItem] = js.native
}

object RosterReceived {
  @scala.inline
  def apply(id: String, roster: js.Array[RosterItem]): RosterReceived = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], roster = roster.asInstanceOf[js.Any])
    __obj.asInstanceOf[RosterReceived]
  }
  @scala.inline
  implicit class RosterReceivedOps[Self <: RosterReceived] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoster(value: js.Array[RosterItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roster")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

